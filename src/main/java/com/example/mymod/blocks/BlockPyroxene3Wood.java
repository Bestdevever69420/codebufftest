package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;

public class BlockPyroxene3Wood extends BlockRotatedPillar {
    public BlockPyroxene3Wood() {
        super(Material.WOOD);
        setRegistryName("pyroxene3_wood");
        setUnlocalizedName(MyMod.MODID + ".pyroxene3_wood");
        setHardness(4.0F);
        setResistance(8.0F);
        setHarvestLevel("axe", 1);
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}