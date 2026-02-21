package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPyroxene2Planks extends Block {
    public BlockPyroxene2Planks() {
        super(Material.WOOD);
        setRegistryName("pyroxene2_planks");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_planks");
        setHardness(4.0F);
        setResistance(8.0F);
        setHarvestLevel("axe", 1);
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}