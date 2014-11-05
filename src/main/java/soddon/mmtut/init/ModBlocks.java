package soddon.mmtut.init;

import cpw.mods.fml.common.registry.GameRegistry;
import soddon.mmtut.block.blocklogstoneoak;
import soddon.mmtut.block.blockmmtut;

public class ModBlocks
{
    public static final blockmmtut logStoneOak = new blocklogstoneoak();

    public static void init()
    {
        GameRegistry.registerBlock(logStoneOak, "log_Stone_Oak");
    }

}
