package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;

public class BlockPyroxene3Door extends BlockDoor {
    public BlockPyroxene3Door() {
        super(Material.WOOD);
        setRegistryName("pyroxene3_door");
        setUnlocalizedName(MyMod.MODID + ".pyroxene3_door");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(3.0F);
        setResistance(5.0F);
        setHarvestLevel("axe", 0);
    }
}
