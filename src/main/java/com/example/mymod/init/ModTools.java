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
import com.example.mymod.tools.ItemPyroxeneAxe;
import com.example.mymod.tools.ItemPyroxeneHoe;
import com.example.mymod.tools.ItemPyroxenePickaxe;
import com.example.mymod.tools.ItemPyroxeneShovel;
import com.example.mymod.tools.ItemPyroxeneSword;

@Mod.EventBusSubscriber(modid = MyMod.MODID)
public class ModTools {
    public static Item pyroxene_pickaxe;
    public static Item pyroxene_axe;
    public static Item pyroxene_sword;
    public static Item pyroxene_shovel;
    public static Item pyroxene_hoe;

    public static void init() {
        pyroxene_pickaxe = new ItemPyroxenePickaxe();
        pyroxene_axe = new ItemPyroxeneAxe();
        pyroxene_sword = new ItemPyroxeneSword();
        pyroxene_shovel = new ItemPyroxeneShovel();
        pyroxene_hoe = new ItemPyroxeneHoe();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(pyroxene_pickaxe, pyroxene_axe, pyroxene_sword, pyroxene_shovel, pyroxene_hoe);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(pyroxene_pickaxe, 0, 
            new ModelResourceLocation(pyroxene_pickaxe.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene_axe, 0, 
            new ModelResourceLocation(pyroxene_axe.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene_sword, 0, 
            new ModelResourceLocation(pyroxene_sword.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene_shovel, 0, 
            new ModelResourceLocation(pyroxene_shovel.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene_hoe, 0, 
            new ModelResourceLocation(pyroxene_hoe.getRegistryName(), "inventory"));
    }
}

