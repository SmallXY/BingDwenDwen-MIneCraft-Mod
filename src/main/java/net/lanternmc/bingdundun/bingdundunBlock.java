package net.lanternmc.bingdundun;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class bingdundunBlock extends Block{

    public bingdundunBlock() {
        super(Material.ROCK);
        this.setCreativeTab(CreativeTabs.MISC);
        this.setHardness(5.0F);
    }

}
