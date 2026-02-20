package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockPyroxeneSlab extends Block {
    public BlockPyroxeneSlab() {
        super(Material.ROCK);
        setRegistryName("pyroxene_slab");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_slab");
        setHardness(4.0F);
        setResistance(8.0F);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(MyMod.CREATIVE_TAB);
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
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
    }
}
