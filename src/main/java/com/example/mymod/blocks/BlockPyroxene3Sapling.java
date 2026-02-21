package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockPyroxene3Sapling extends BlockBush {

    public static final net.minecraft.block.properties.PropertyInteger STAGE = net.minecraft.block.properties.PropertyInteger.create("stage", 0, 1);

    public BlockPyroxene3Sapling() {
        setRegistryName("pyroxene3_sapling");
        setUnlocalizedName(MyMod.MODID + ".pyroxene3_sapling");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(0.0F);
        setSoundType(SoundType.PLANT);
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return Blocks.SAPLING.getBlockLayer();
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, STAGE);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(STAGE, Integer.valueOf(meta & 1));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(STAGE).intValue();
    }

}
