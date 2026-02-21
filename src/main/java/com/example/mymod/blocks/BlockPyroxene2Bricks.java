package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MapColor;

public class BlockPyroxene2Bricks extends Block {
    public BlockPyroxene2Bricks() {
        super(Material.ROCK, MapColor.ADOBE);
        setRegistryName("pyroxene2_bricks");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_bricks");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(4.0F);
        setResistance(8.0F);
    }
}