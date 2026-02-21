package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;

public class BlockPyroxene2Door extends BlockDoor {
    public BlockPyroxene2Door() {
        super(Material.WOOD);
        setRegistryName("pyroxene2_door");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_door");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(3.0F);
        setResistance(5.0F);
        setHarvestLevel("axe", 0);
    }
}
