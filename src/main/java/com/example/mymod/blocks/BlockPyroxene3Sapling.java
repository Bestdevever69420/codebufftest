package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockPyroxene3Sapling extends BlockSapling {
    public BlockPyroxene3Sapling() {
        super();
        setRegistryName("pyroxene3_sapling");
        setUnlocalizedName(MyMod.MODID + ".pyroxene3_sapling");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(0.0F);
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return Blocks.SAPLING.getBlockLayer();
    }

    @Override
    public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        // Tree generation handled by biome
    }
}