package com.example.mymod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import com.example.mymod.init.ModItems;

public class MyModCreativeTab extends CreativeTabs {
    public MyModCreativeTab() {
        super(MyMod.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.pyroxene_ingot);
    }
}
