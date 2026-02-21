package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockPyroxene3PlanksStairs extends BlockStairs {
    public BlockPyroxene3PlanksStairs(IBlockState modelState) {
        super(modelState);
        setRegistryName("pyroxene3_planks_stairs");
        setUnlocalizedName(MyMod.MODID + ".pyroxene3_planks_stairs");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(2.0F);
        setResistance(5.0F);
    }
}
