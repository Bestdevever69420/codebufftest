package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockPyroxeneStairs extends BlockStairs {
    public BlockPyroxeneStairs(IBlockState modelState) {
        super(modelState);
        setRegistryName("pyroxene_stairs");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_stairs");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
