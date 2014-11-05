package soddon.mmtut;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import soddon.mmtut.handler.configurationHandler;
import soddon.mmtut.init.ModItems;
import soddon.mmtut.proxy.IProxy;
import soddon.mmtut.reference.Reference;
import soddon.mmtut.utility.LogHelper;

@Mod(modid= Reference.MOD_ID,name=Reference.MOD_NAME,version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class mmtut
{
    @Mod.Instance(Reference.MOD_ID)
    public static mmtut instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        configurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new configurationHandler());
        ModItems.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
