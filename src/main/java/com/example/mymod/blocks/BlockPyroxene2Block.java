package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MapColor;

public class BlockPyroxene2Block extends Block {
    public BlockPyroxene2Block() {
        super(Material.ROCK, MapColor.ADOBE);
        setRegistryName("pyroxene2_block");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_block");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(5.0F);
        setResistance(10.0F);
    }
}