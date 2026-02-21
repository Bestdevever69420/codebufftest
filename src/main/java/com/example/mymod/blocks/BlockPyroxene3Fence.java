package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MapColor;

public class BlockPyroxene3Fence extends BlockFence {
    public BlockPyroxene3Fence() {
        super(Material.WOOD, MapColor.WOOD);
        setRegistryName("pyroxene3_fence");
        setUnlocalizedName(MyMod.MODID + ".pyroxene3_fence");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(2.0F);
        setResistance(5.0F);
        // setHarvestLevel("axe", 0); // Removed - caused crash
    }
}
