package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPyroxeneBricks extends Block {
    public BlockPyroxeneBricks() {
        super(Material.ROCK);
        setRegistryName("pyroxene_bricks");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_bricks");
        setHardness(4.0F);
        setResistance(8.0F);
        // setHarvestLevel("pickaxe", 0); // Removed - caused crash
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
