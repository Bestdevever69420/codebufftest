package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPyroxene2PlanksDoubleSlab extends Block {
    public BlockPyroxene2PlanksDoubleSlab() {
        super(Material.WOOD);
        setRegistryName("pyroxene2_planks_double_slab");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_planks_double_slab");
        setHardness(2.0F);
        setResistance(5.0F);
        setHarvestLevel("axe", 0);
    }
}
