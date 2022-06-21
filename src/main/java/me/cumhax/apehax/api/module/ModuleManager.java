package me.cumhax.apehax.api.module;

import me.cumhax.apehax.impl.module.combat.*;
import me.cumhax.apehax.impl.module.exploit.*;
import me.cumhax.apehax.impl.module.hud.*;
import me.cumhax.apehax.impl.module.misc.*;
import me.cumhax.apehax.impl.module.movement.*;
import me.cumhax.apehax.impl.module.render.*;

import java.util.ArrayList;

public class ModuleManager {
	private final static ArrayList<Module> modules = new ArrayList<>();

	public ModuleManager() {
//Combat
modules.add(new Auto32k("Auto32K", "", Category.COMBAT));
modules.add(new AutoArmor("AutoArmor", "", Category.COMBAT));
modules.add(new AutoCrystal("AutoCrystal", "", Category.COMBAT));
modules.add(new AutoLog("AutoLog", "", Category.COMBAT));
modules.add(new AutoTNTCart("AutoTNTCart", "", Category.COMBAT));
modules.add(new AutoTotem("AutoTotem", "", Category.COMBAT));
modules.add(new AutoTrap("AutoTrap", "", Category.COMBAT));
modules.add(new BedAura("BedAura", "", Category.COMBAT));
modules.add(new BedAuraEcMe("BedAuraEcMe", "", Category.COMBAT));
modules.add(new Burrow("Burrow", "", Category.COMBAT));
modules.add(new Criticals("Criticals", "", Category.COMBAT));
modules.add(new FastBow("FastBow", "", Category.COMBAT));
modules.add(new HoleFiller("HoleFiller", "", Category.COMBAT));
modules.add(new KillAura("KillAura", "", Category.COMBAT));
modules.add(new NewAutoCrystal("NewAutoCrystal", "", Category.COMBAT));
modules.add(new NewOffhand("NewOffhand", "", Category.COMBAT));
modules.add(new Offhand("Offhand", "", Category.COMBAT));
modules.add(new PacketXP("PacketXP", "", Category.COMBAT));
modules.add(new SelfTrap("SelfTrap", "", Category.COMBAT));
modules.add(new SelfWeb("SelfWeb", "", Category.COMBAT));
modules.add(new Surround("Surround", "", Category.COMBAT));
//Exploit
modules.add(new AirJump("AirJump", "", Category.EXPLOIT));
modules.add(new AntiEndCrystal("AntiEndCrystal", "", Category.EXPLOIT));
modules.add(new AntiHunger("AntiHunger", "", Category.EXPLOIT));
modules.add(new AntiSurround("AntiSurround", "", Category.EXPLOIT));
modules.add(new BackTP("BacktTP", "", Category.EXPLOIT));
modules.add(new BoatClip("BoatClip", "", Category.EXPLOIT));
modules.add(new BoatPlaceBypass("BoatPLaceBypass", "", Category.EXPLOIT));
modules.add(new FastPlace("FastPlace", "", Category.EXPLOIT));
modules.add(new ForceCrash("ForceCrash", "", Category.EXPLOIT));
modules.add(new LavaFlight("LavaFlight", "", Category.EXPLOIT));
modules.add(new NoBreakAnimation("NoBreakAnimation", "", Category.EXPLOIT));
modules.add(new NoVoid("NoVoid", "", Category.EXPLOIT));
modules.add(new OffhandSwing("OffhandSwing", "", Category.EXPLOIT));
modules.add(new PacketFly("PacketFly", "", Category.EXPLOIT));
modules.add(new PacketMine("PacketMine", "", Category.EXPLOIT));
modules.add(new PingBypass("PingBypass", "", Category.EXPLOIT));
modules.add(new PluginsGrabber("PluginsGrabber", "", Category.EXPLOIT));
modules.add(new PortalGodMode("PortalGodMode", "", Category.EXPLOIT));
//Hud
modules.add(new ActiveModules("ArrayList", "", Category.HUD));
modules.add(new ClickGUI("ClickGUI", "", Category.HUD));
modules.add(new Compass("Compass", "", Category.HUD));
modules.add(new CoordsHUD("CoordsHUD", "", Category.HUD));
modules.add(new PotionUI("PotionUI", "", Category.HUD));
modules.add(new PvPInfo("PvPInfo", "", Category.HUD));
modules.add(new Watermark("Watermark", "", Category.HUD));
//Misc
modules.add(new AntiBlind("AntiBlind", "", Category.MISC));
modules.add(new AntiCactus("AntiCactus", "", Category.MISC));
modules.add(new AntiFire("AntiFire", "", Category.MISC));
modules.add(new AntiFog("AntiFog", "", Category.MISC));
modules.add(new AntiLevitate("AntiLevitate", "", Category.MISC));
modules.add(new AntiOverlay("AntiOverlay", "", Category.MISC));
modules.add(new AutoRespawn("AutoRespawn", "", Category.MISC));
modules.add(new Blink("Blink", "", Category.MISC));
modules.add(new ChatSuffix("ChatSuffix", "", Category.MISC));
modules.add(new DiscordRPC("RPC", "", Category.MISC));
modules.add(new FakeGamemode("FakeGamemode", "", Category.MISC));
modules.add(new GreenText("GreenText", "", Category.MISC));
modules.add(new MultiTask("MultiTask", "", Category.MISC));
modules.add(new NoSoundLag("NoSoundLag", "", Category.MISC));
modules.add(new PortalChat("PortalChat", "", Category.MISC));
modules.add(new Reach("Reach", "", Category.MISC));
modules.add(new SkinBlinker("SkinBlinker", "", Category.MISC));
modules.add(new StrengthDetect("StrenghDetect", "", Category.MISC));
modules.add(new TerroristNotifier("TerroristNotifier", "", Category.MISC));
modules.add(new Timer("Timer", "", Category.MISC));
modules.add(new ToggleMSG("ToggleMSG", "", Category.MISC));
modules.add(new XCarry("XCarry", "", Category.MISC));
//Movement
modules.add(new Anchor("Anchor", "", Category.MOVEMENT));
modules.add(new AutoSwim("AutoSwim", "", Category.MOVEMENT));
modules.add(new AutoWalk("AutoWalk", "", Category.MOVEMENT));
modules.add(new BoatFly("BoatFly", "", Category.MOVEMENT));
//modules.add(new ElytraFlight("ElytraFlight", "", Category.MOVEMENT));
modules.add(new FastSwim("FastSwim", "", Category.MOVEMENT));
modules.add(new Flight("Flight", "", Category.MOVEMENT));
modules.add(new InventoryMove("InventoryMove", "", Category.MOVEMENT));
modules.add(new LongJump("LongJump", "", Category.MOVEMENT));
modules.add(new NoGlitchBlocks("NoGlitchBlocks", "", Category.MOVEMENT));
modules.add(new NoSlow("NoSlow", "", Category.MOVEMENT));
modules.add(new OldStrafe("OldStrafe", "", Category.MOVEMENT));
modules.add(new ReverseStep("ReverseStep", "", Category.MOVEMENT));
modules.add(new Sprint("Sprint", "", Category.MOVEMENT));
modules.add(new Step("Step", "", Category.MOVEMENT));
modules.add(new Strafe("Strafe", "", Category.MOVEMENT));
modules.add(new Velocity("Velocity", "", Category.MOVEMENT));
modules.add(new YPort("YPort", "", Category.MOVEMENT));
//Render
modules.add(new BlockHighlight("BlockHighlight", "", Category.RENDER));
modules.add(new CameraClip("CameraClip", "", Category.RENDER));
modules.add(new Chams("Chams", "", Category.RENDER));
modules.add(new CustomFont("CustomFont", "", Category.RENDER));
modules.add(new EnchantColor("EnchantColor", "", Category.RENDER));
modules.add(new Fov("Fov", "", Category.RENDER));
modules.add(new Fullbright("Fullbright", "", Category.RENDER));
modules.add(new HoleEsp("HoleEsp", "", Category.RENDER));
modules.add(new ItemViewmodle("ItemViewmodle", "", Category.RENDER));
modules.add(new LowHands("LowHands", "", Category.RENDER));
modules.add(new NameTags("NameTags", "", Category.RENDER));
modules.add(new NoBob("NoBob", "", Category.RENDER));
modules.add(new NoHurtCam("NoHurtCam", "", Category.RENDER));
modules.add(new NoWeather("NoWeather", "", Category.RENDER));
modules.add(new ShulkerPreview("ShulkerPreview", "", Category.RENDER));
modules.add(new Skeleton("Skeleton", "", Category.RENDER));
modules.add(new SkyColor("SkyColor", "", Category.RENDER));
	}

//StrengthDetect
	public static ArrayList<Module> getModules() {
		return modules;
	}

	public static void onRender() {
		modules.stream().filter(Module::isEnabled);
	}

	public static Module getModule(String name) {
		for (Module module : modules) {
			if (module.getName().equalsIgnoreCase(name))
				return module;
		}

		return null;
	}

	public ArrayList<Module> getModules(Category category) {
		ArrayList<Module> mods = new ArrayList<>();

		for (Module module : modules) {
			if (module.getCategory().equals(category))
				mods.add(module);
		}

		return mods;
	}
}
