package com.example.mymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPyroxene3Bricks extends Block {
    public BlockPyroxene3Bricks() {
        super(Material.ROCK);
        setRegistryName("pyroxene3_bricks");
        setUnlocalizedName("pyroxene3_bricks");
        setHardness(4.0f);
        setResistance(8.0f);
    }
}