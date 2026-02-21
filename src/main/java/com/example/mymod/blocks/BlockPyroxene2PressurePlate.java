package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockPyroxene2PressurePlate extends BlockPressurePlate {
    public BlockPyroxene2PressurePlate() {
        super(Material.WOOD, Sensitivity.MOBS);
        setSoundType(SoundType.WOOD);
        setRegistryName("pyroxene2_pressure_plate");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_pressure_plate");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(0.5F);
        setResistance(0.5F);
    }
}
