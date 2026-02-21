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
import com.example.mymod.armor.ItemPyroxene2Helmet;
import com.example.mymod.armor.ItemPyroxene2Chestplate;
import com.example.mymod.armor.ItemPyroxene2Leggings;
import com.example.mymod.armor.ItemPyroxene2Boots;
import com.example.mymod.armor.ItemPyroxene3Helmet;
import com.example.mymod.armor.ItemPyroxene3Chestplate;
import com.example.mymod.armor.ItemPyroxene3Leggings;
import com.example.mymod.armor.ItemPyroxene3Boots;

@Mod.EventBusSubscriber(modid = MyMod.MODID)
public class ModArmor {
    public static Item pyroxene_helmet;
    public static Item pyroxene_chestplate;
    public static Item pyroxene_leggings;
    public static Item pyroxene_boots;
    public static Item pyroxene2_helmet;
    public static Item pyroxene2_chestplate;
    public static Item pyroxene2_leggings;
    public static Item pyroxene2_boots;
    public static Item pyroxene3_helmet;
    public static Item pyroxene3_chestplate;
    public static Item pyroxene3_leggings;
    public static Item pyroxene3_boots;

    public static void init() {
        pyroxene_helmet = new ItemPyroxeneHelmet();
        pyroxene_chestplate = new ItemPyroxeneChestplate();
        pyroxene_leggings = new ItemPyroxeneLeggings();
        pyroxene_boots = new ItemPyroxeneBoots();
        pyroxene2_helmet = new ItemPyroxene2Helmet();
        pyroxene2_chestplate = new ItemPyroxene2Chestplate();
        pyroxene2_leggings = new ItemPyroxene2Leggings();
        pyroxene2_boots = new ItemPyroxene2Boots();
        pyroxene3_helmet = new ItemPyroxene3Helmet();
        pyroxene3_chestplate = new ItemPyroxene3Chestplate();
        pyroxene3_leggings = new ItemPyroxene3Leggings();
        pyroxene3_boots = new ItemPyroxene3Boots();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            pyroxene_helmet, pyroxene_chestplate, pyroxene_leggings, pyroxene_boots,
            pyroxene2_helmet, pyroxene2_chestplate, pyroxene2_leggings, pyroxene2_boots,
            pyroxene3_helmet, pyroxene3_chestplate, pyroxene3_leggings, pyroxene3_boots
        );
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
        ModelLoader.setCustomModelResourceLocation(pyroxene2_helmet, 0, 
            new ModelResourceLocation(pyroxene2_helmet.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene2_chestplate, 0, 
            new ModelResourceLocation(pyroxene2_chestplate.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene2_leggings, 0, 
            new ModelResourceLocation(pyroxene2_leggings.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene2_boots, 0, 
            new ModelResourceLocation(pyroxene2_boots.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene3_helmet, 0, 
            new ModelResourceLocation(pyroxene3_helmet.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene3_chestplate, 0, 
            new ModelResourceLocation(pyroxene3_chestplate.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene3_leggings, 0, 
            new ModelResourceLocation(pyroxene3_leggings.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene3_boots, 0, 
            new ModelResourceLocation(pyroxene3_boots.getRegistryName(), "inventory"));
    }
}

