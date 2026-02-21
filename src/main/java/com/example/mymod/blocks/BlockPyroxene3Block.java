package com.example.mymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPyroxene3Block extends Block {
    public BlockPyroxene3Block() {
        super(Material.IRON);
        setRegistryName("pyroxene3_block");
        setUnlocalizedName("pyroxene3_block");
        setHardness(5.0f);
        setResistance(10.0f);
    }
}