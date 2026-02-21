package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import com.example.mymod.world.WorldGenPyroxeneTree;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class BlockPyroxeneSapling extends BlockBush implements IGrowable {

    public static final net.minecraft.block.properties.PropertyInteger STAGE = net.minecraft.block.properties.PropertyInteger.create("stage", 0, 1);

    public BlockPyroxeneSapling() {
        setRegistryName("pyroxene_sapling");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_sapling");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setSoundType(SoundType.PLANT);
        this.setDefaultState(this.blockState.getBaseState().withProperty(STAGE, Integer.valueOf(0)));
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.isRemote) {
            super.updateTick(worldIn, pos, state, rand);
            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0) {
                this.generateTree(worldIn, pos, state, rand);
            }
        }
    }

    public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        WorldGenerator worldgenerator = new WorldGenPyroxeneTree();
        IBlockState blockstate = Blocks.AIR.getDefaultState();
        worldIn.setBlockState(pos, blockstate, 4);
        worldgenerator.generate(worldIn, rand, pos);
    }

    @Override
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return (double)worldIn.rand.nextFloat() < 0.45D;
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        this.generateTree(worldIn, pos, state, rand);
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
