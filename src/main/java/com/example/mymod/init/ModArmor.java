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
import com.example.mymod.armor.ItemPyroxeneBoots;
import com.example.mymod.armor.ItemPyroxeneChestplate;
import com.example.mymod.armor.ItemPyroxeneHelmet;
import com.example.mymod.armor.ItemPyroxeneLeggings;

@Mod.EventBusSubscriber(modid = MyMod.MODID)
public class ModArmor {
    public static Item pyroxene_helmet;
    public static Item pyroxene_chestplate;
    public static Item pyroxene_leggings;
    public static Item pyroxene_boots;

    public static void init() {
        pyroxene_helmet = new ItemPyroxeneHelmet();
        pyroxene_chestplate = new ItemPyroxeneChestplate();
        pyroxene_leggings = new ItemPyroxeneLeggings();
        pyroxene_boots = new ItemPyroxeneBoots();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(pyroxene_helmet, pyroxene_chestplate, pyroxene_leggings, pyroxene_boots);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(pyroxene_helmet, 0, 
            new ModelResourceLocation(pyroxene_helmet.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene_chestplate, 0, 
            new ModelResourceLocation(pyroxene_chestplate.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene_leggings, 0, 
            new ModelResourceLocation(pyroxene_leggings.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene_boots, 0, 
            new ModelResourceLocation(pyroxene_boots.getRegistryName(), "inventory"));
    }
}

