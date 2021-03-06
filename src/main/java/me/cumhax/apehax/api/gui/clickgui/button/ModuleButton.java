package me.cumhax.apehax.api.gui.clickgui.button;

import me.cumhax.apehax.Client;
import me.cumhax.apehax.api.gui.clickgui.button.settings.BindButton;
import me.cumhax.apehax.api.gui.clickgui.button.settings.BoolButton;
import me.cumhax.apehax.api.gui.clickgui.button.settings.EnumButton;
import me.cumhax.apehax.api.gui.clickgui.button.settings.SliderButton;
import me.cumhax.apehax.api.module.Module;
import me.cumhax.apehax.api.setting.Setting;
import me.cumhax.apehax.api.setting.SettingType;
import me.cumhax.apehax.api.util.font.FontUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author yoink
 * @since 9/20/2020
 */
public class ModuleButton {
	private final Minecraft mc = Minecraft.getMinecraft();
	private final Module module;
	private final ArrayList<SettingButton> buttons = new ArrayList<>();
	private final int W;
	private final int H;
	private int X;
	private int Y;
	private boolean open;
	private int showingModuleCount;
	private boolean opening;
	private boolean closing;

	public ModuleButton(Module module, int x, int y, int w, int h) {
		this.module = module;
		X = x;
		Y = y;
		W = w;
		H = h;

		int n = 0;
		for (Setting setting : Client.settingManager.getSettings(module)) {
			SettingButton settingButton = null;

			if (setting.getType().equals(SettingType.BOOLEAN)) {
				settingButton = new BoolButton(module, setting, X, Y + H + n, W, H);
			} else if (setting.getType().equals(SettingType.INTEGER)) {
				settingButton = new SliderButton.IntSlider(module, setting, X, Y + H + n, W, H);
			} else if (setting.getType().equals(SettingType.ENUM)) {
				settingButton = new EnumButton(module, setting, X, Y + H + n, W, H);
			}

			if (settingButton != null) {
				buttons.add(settingButton);

				n += H;
			}

		}

		buttons.add(new BindButton(module, X, Y + H + n, W, H));
	}

	public void render(int mX, int mY) {

		if (module.isEnabled()) {
			if (isHover(X, Y, W, H - 1, mX, mY)) {
				Client.clickGUI.drawGradient(X, Y, X + W, Y + H, new Color(25, 25, 25, 170).getRGB(),
						new Color(25, 25, 25, 170).getRGB());
			} else {
				Client.clickGUI.drawGradient(X, Y, X + W, Y + H, new Color(25, 25, 25, 150).getRGB(),
						new Color(25, 25, 25, 150).getRGB());
			}
			FontUtil.drawStringWithShadow(module.getName(), (float) (X + 5), (float) (Y + 4),
					new Color(Client.settingManager.getSetting("ClickGUI", "Red").getIntegerValue(),
							Client.settingManager.getSetting("ClickGUI", "Green").getIntegerValue(),
							Client.settingManager.getSetting("ClickGUI", "Blue").getIntegerValue(), 255).getRGB());
		} else {
			if (isHover(X, Y, W, H - 1, mX, mY)) {
				Client.clickGUI.drawGradient(X, Y, X + W, Y + H, new Color(25, 25, 25, 170).getRGB(),
						new Color(25, 25, 25, 171).getRGB());
			} else {
				Client.clickGUI.drawGradient(X, Y, X + W, Y + H, new Color(25, 25, 25, 150).getRGB(),
						new Color(25, 25, 25, 151).getRGB());
			}

			FontUtil.drawString(module.getName(), (float) (X + 5), (float) (Y + 4),
					new Color(255, 255, 255, 255).getRGB());
		}

		if (opening) {
			showingModuleCount++;
			if (showingModuleCount == buttons.size()) {
				opening = false;
				open = true;
			}
		}

		if (closing) {
			showingModuleCount--;
			if (showingModuleCount == 0) {
				closing = false;
				open = false;
			}
		}

		if (isHover(X, Y, W, H - 1, mX, mY) && module.getDescription() != null && !module.getDescription().equals("")) {
			FontUtil.drawStringWithShadow(module.getDescription(), 2,
					(new ScaledResolution(mc).getScaledHeight() - FontUtil.getFontHeight() - 2),
					new Color(0xF2C4C4C4, true).getRGB());
		}
	}

	public void mouseDown(int mX, int mY, int mB) {
		if (isHover(X, Y, W, H - 1, mX, mY)) {
			if (mB == 0) {
				module.toggle();
				if (module.getName().equals("ClickGUI")) {
					mc.displayGuiScreen(null);
				}
			} else if (mB == 1) {
				processRightClick();
			}
		}

		if (open) {
			for (SettingButton settingButton : buttons) {
				settingButton.mouseDown(mX, mY, mB);
			}
		}
	}

	public void mouseUp(int mX, int mY) {
		for (SettingButton settingButton : buttons) {
			settingButton.mouseUp(mX, mY);
		}
	}

	public void keyPress(int key) {
		for (SettingButton settingButton : buttons) {
			settingButton.keyPress(key);
		}
	}

	public void close() {
		for (SettingButton button : buttons) {
			button.close();
		}
	}

	private boolean isHover(int X, int Y, int W, int H, int mX, int mY) {
		return mX >= X && mX <= X + W && mY >= Y && mY <= Y + H;
	}

	public void setX(int x) {
		X = x;
	}

	public void setY(int y) {
		Y = y;
	}

	public boolean isOpen() {
		return open;
	}

	public Module getModule() {
		return module;
	}

	public ArrayList<SettingButton> getButtons() {
		return buttons;
	}

	public int getShowingModuleCount() {
		return showingModuleCount;
	}

	public boolean isOpening() {
		return opening;
	}

	public boolean isClosing() {
		return closing;
	}

	public void processRightClick() {
		if (!open) {
			showingModuleCount = 0;
			opening = true;
		} else {
			showingModuleCount = buttons.size();
			closing = true;
		}
	}
}
