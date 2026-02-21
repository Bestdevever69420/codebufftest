package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockPyroxenePlanksStairs extends BlockStairs {
    public BlockPyroxenePlanksStairs(IBlockState modelState) {
        super(modelState);
        setRegistryName("pyroxene_planks_stairs");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_planks_stairs");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(2.0F);
        setResistance(5.0F);
    }
}
