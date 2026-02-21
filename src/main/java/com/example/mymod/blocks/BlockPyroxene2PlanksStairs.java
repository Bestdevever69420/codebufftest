package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockPyroxene2PlanksStairs extends BlockStairs {
    public BlockPyroxene2PlanksStairs(IBlockState modelState) {
        super(modelState);
        setRegistryName("pyroxene2_planks_stairs");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_planks_stairs");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(2.0F);
        setResistance(5.0F);
    }
}
