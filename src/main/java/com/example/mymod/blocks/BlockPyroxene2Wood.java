package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;

public class BlockPyroxene2Wood extends BlockRotatedPillar {
    public BlockPyroxene2Wood() {
        super(Material.WOOD);
        setRegistryName("pyroxene2_wood");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_wood");
        setHardness(4.0F);
        setResistance(8.0F);
        // setHarvestLevel("axe", 0); // Removed - caused crash
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}