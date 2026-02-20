package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockPyroxene extends Block {
    public BlockPyroxene() {
        super(Material.IRON);
        setRegistryName("pyroxene_block");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_block");
        setHardness(5.0F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(MyMod.CREATIVE_TAB);
    }

    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
        return true;
    }
}
