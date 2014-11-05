package soddon.mmtut.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;


public class blocklogstoneoak extends blockmmtut
{
    @SideOnly(Side.CLIENT)
    protected IIcon blockIconTop;

    public blocklogstoneoak()
    {
        super();
        this.setBlockName("log_stone_oak");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        blockIconTop = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1) + "_Top");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {
        if (side <= 1) {
            return blockIconTop;
        } else {
            return blockIcon;
        }
    }
}