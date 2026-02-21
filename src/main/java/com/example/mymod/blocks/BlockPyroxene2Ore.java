package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MapColor;

public class BlockPyroxene2Ore extends BlockOre {
    public BlockPyroxene2Ore() {
        super();
        setRegistryName("pyroxene2_ore");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_ore");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(3.0F);
        setResistance(5.0F);
    }
}
