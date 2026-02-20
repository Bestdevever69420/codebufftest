package com.example.mymod.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.example.mymod.MyMod;
import com.example.mymod.items.ItemPyroxeneIngot;
import com.example.mymod.items.ItemPyroxeneNugget;

@Mod.EventBusSubscriber(modid = MyMod.MODID)
public class ModItems {
    public static Item pyroxene_ingot;
    public static Item pyroxene_nugget;

    public static void init() {
        pyroxene_ingot = new ItemPyroxeneIngot();
        pyroxene_nugget = new ItemPyroxeneNugget();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(pyroxene_ingot, pyroxene_nugget);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(pyroxene_ingot, 0, 
            new ModelResourceLocation(pyroxene_ingot.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene_nugget, 0, 
            new ModelResourceLocation(pyroxene_nugget.getRegistryName(), "inventory"));
    }
}

