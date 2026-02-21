package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import com.example.mymod.init.ModBlocks;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;
import net.minecraft.util.NonNullList;
import net.minecraft.item.ItemStack;

public class BlockPyroxene3Leaves extends BlockLeaves {
    public static final PropertyBool DECAYABLE = PropertyBool.create("decayable");
    public static final PropertyBool CHECK_DECAY = PropertyBool.create("check_decay");

    public BlockPyroxene3Leaves() {
        super();
        setRegistryName("pyroxene3_leaves");
        setUnlocalizedName(MyMod.MODID + ".pyroxene3_leaves");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(0.2F);
        setResistance(0.2F);
        setHarvestLevel("axe", 0);
        this.setDefaultState(this.blockState.getBaseState().withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, CHECK_DECAY, DECAYABLE);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(CHECK_DECAY, Boolean.valueOf((meta & 4) != 0)).withProperty(DECAYABLE, Boolean.valueOf((meta & 2) != 0));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int i = 0;
        if (state.getValue(CHECK_DECAY).booleanValue()) {
            i |= 4;
        }
        if (state.getValue(DECAYABLE).booleanValue()) {
            i |= 2;
        }
        return i;
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return Blocks.LEAVES.getBlockLayer();
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
        return java.util.Collections.singletonList(new ItemStack(this));
    }

    @Override
    public net.minecraft.block.BlockPlanks.EnumType getWoodType(int meta) {
        return net.minecraft.block.BlockPlanks.EnumType.JUNGLE;
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        super.getDrops(drops, world, pos, state, fortune);
        if (rand.nextInt(100) < 5 + (fortune * 5)) {
            drops.add(new ItemStack(ModBlocks.pyroxene3_sapling));
        }
    }
}
