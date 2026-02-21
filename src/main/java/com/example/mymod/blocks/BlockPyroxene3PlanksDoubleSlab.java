package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPyroxene3PlanksDoubleSlab extends Block {
    public BlockPyroxene3PlanksDoubleSlab() {
        super(Material.WOOD);
        setRegistryName("pyroxene3_planks_double_slab");
        setUnlocalizedName(MyMod.MODID + ".pyroxene3_planks_double_slab");
        setHardness(2.0F);
        setResistance(5.0F);
        // setHarvestLevel("axe", 0); // Removed - caused crash
    }
}
