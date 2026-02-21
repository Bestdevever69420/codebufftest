package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import com.example.mymod.init.ModBlocks;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;
import net.minecraft.util.NonNullList;

public class BlockPyroxeneLeaves extends BlockLeaves {
    public static final PropertyBool DECAYABLE = PropertyBool.create("decayable");
    public static final PropertyBool CHECK_DECAY = PropertyBool.create("check_decay");

    public BlockPyroxeneLeaves() {
        super();
        setRegistryName("pyroxene_leaves");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_leaves");
        setHardness(0.2F);
        setResistance(0.2F);
        // setHarvestLevel("axe", 0); // Removed - caused crash
        setCreativeTab(MyMod.CREATIVE_TAB);
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
        
        // Always drop itself (the leaves)
        super.getDrops(drops, world, pos, state, fortune);
        
        // Chance to drop sapling (5% base, up to 20% with fortune)
        if (rand.nextInt(100) < 5 + (fortune * 5)) {
            drops.add(new ItemStack(ModBlocks.pyroxene_sapling));
        }
    }
}
