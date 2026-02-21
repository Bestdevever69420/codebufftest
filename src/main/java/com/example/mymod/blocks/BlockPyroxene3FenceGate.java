package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;

import java.util.List;
import java.util.Random;

public class BlockPyroxene3FenceGate extends Block {
    public static final PropertyDirection FACING = PropertyDirection.create("facing");
    public static final PropertyBool IS_OPEN = PropertyBool.create("open");
    protected static final AxisAlignedBB AABB_CLOSED = new AxisAlignedBB(0.0D, 0.0D, 0.375D, 1.0D, 1.0D, 0.625D);
    protected static final AxisAlignedBB AABB_OPEN_X = new AxisAlignedBB(0.375D, 0.0D, 0.0D, 0.625D, 1.0D, 1.0D);
    protected static final AxisAlignedBB AABB_OPEN_Z = new AxisAlignedBB(0.0D, 0.0D, 0.375D, 1.0D, 1.0D, 0.625D);

    public BlockPyroxene3FenceGate() {
        super(Material.WOOD);
        setRegistryName("pyroxene3_fence_gate");
        setUnlocalizedName(MyMod.MODID + ".pyroxene3_fence_gate");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(2.0F);
        setResistance(5.0F);
        setHarvestLevel("axe", 0);
        setTickRandomly(true);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos) {
        Boolean isOpen = state.getValue(IS_OPEN);
        EnumFacing facing = state.getValue(FACING);
        
        if (isOpen != null && isOpen) {
            if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH) {
                return AABB_OPEN_Z;
            } else {
                return AABB_OPEN_X;
            }
        }
        return AABB_CLOSED;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        state = state.cycleProperty(IS_OPEN);
        worldIn.setBlockState(pos, state, 2);
        worldIn.playSound(playerIn, pos, net.minecraft.init.SoundEvents.BLOCK_FENCE_GATE_OPEN, net.minecraft.util.SoundCategory.BLOCKS, 1.0F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
        return true;
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i |= state.getValue(FACING).getHorizontalIndex();
        if (state.getValue(IS_OPEN)) {
            i |= 4;
        }
        return i;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState()
            .withProperty(FACING, EnumFacing.getHorizontal(meta & 3))
            .withProperty(IS_OPEN, (meta & 4) != 0);
    }
}
