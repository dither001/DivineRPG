package divinerpg.config;

import divinerpg.DivineRPG;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = DivineRPG.MODID)
@Config(modid = DivineRPG.MODID, name="divinerpg/general_config")
public class GeneralConfig {

    @Config.Name("General Options")
    @Config.Comment("Configure general settings here")
    public static GeneralOptions generalOptions = new GeneralOptions();

    public static class GeneralOptions {
        @Config.Name("Debug mode")
        @Config.Comment("Prints a bunch of extra, mostly unvetted information. Keep this disabled unless instructed")
        public boolean enableDebugMode = false;

        @Config.Name("Enable player hats")
        @Config.Comment("Set to false to disable player hats for special players")
        public boolean enablePlayerHats = true;

        @Config.Name("Enable welcome messages")
        @Config.Comment("Set to false to disable the welcome messages for special players")
        public boolean enableWelcomeMessages = true;
    }

    @Config.Name("Dimension IDs")
    @Config.Comment("Configure DivineRPG dimension IDs here. Don't change these unless you know what you're doing")
    @Config.RequiresMcRestart
    public static DimensionIDs dimensionIDs = new DimensionIDs();

    public static class DimensionIDs {
        @Config.Name("Eden")
        public int edenDimensionID = 420;
        @Config.Name("Wildwood")
        public int wildwoodDimensionID = 421;
        @Config.Name("Apalachia")
        public int apalachiaDimensionID = 422;
        @Config.Name("Skythern")
        public int skythernDimensionID = 423;
        @Config.Name("Mortum")
        public int mortumDimensionID = 424;
        @Config.Name("Iceika")
        public int iceikaDimensionID = 425;
        @Config.Name("Arcana")
        public int arcanaDimensionID = 426;
        @Config.Name("Vethea")
        public int vetheaDimensionID = 427;
    }

    @Config.Name("GUI Options")
    @Config.Comment("Configure GUI settings here")
    public static GUIOptions guiOptions = new GUIOptions();

    public static class GUIOptions {
        @Config.Name("ArcanaX")
        @Config.RangeInt(min = 1, max = 255)
        public int arcanaX = 111;
        @Config.Name("ArcanaY")
        @Config.RangeInt(min = 1, max = 255)
        public int arcanaY = 18;
    }

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(DivineRPG.MODID)) {
            ConfigManager.sync(DivineRPG.MODID, Config.Type.INSTANCE);
        }
    }
}
