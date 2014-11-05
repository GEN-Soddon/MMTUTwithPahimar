package soddon.mmtut.init;

import cpw.mods.fml.common.registry.GameRegistry;
import soddon.mmtut.item.itemStoneDust;
import soddon.mmtut.item.itemtut;

public class ModItems
{
    public static final itemtut stoneDust = new itemStoneDust();

    public static void init()
    {
        GameRegistry.registerItem(stoneDust, "stoneDust");
    }
}
