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
import com.example.mymod.tools.ItemPyroxene2Pickaxe;
import com.example.mymod.tools.ItemPyroxene2Axe;
import com.example.mymod.tools.ItemPyroxene2Sword;
import com.example.mymod.tools.ItemPyroxene2Shovel;
import com.example.mymod.tools.ItemPyroxene2Hoe;
import com.example.mymod.tools.ItemPyroxene3Pickaxe;
import com.example.mymod.tools.ItemPyroxene3Axe;
import com.example.mymod.tools.ItemPyroxene3Sword;
import com.example.mymod.tools.ItemPyroxene3Shovel;
import com.example.mymod.tools.ItemPyroxene3Hoe;

@Mod.EventBusSubscriber(modid = MyMod.MODID)
public class ModTools {
    public static Item pyroxene_pickaxe;
    public static Item pyroxene_axe;
    public static Item pyroxene_sword;
    public static Item pyroxene_shovel;
    public static Item pyroxene_hoe;
    public static Item pyroxene2_pickaxe;
    public static Item pyroxene2_axe;
    public static Item pyroxene2_sword;
    public static Item pyroxene2_shovel;
    public static Item pyroxene2_hoe;
    public static Item pyroxene3_pickaxe;
    public static Item pyroxene3_axe;
    public static Item pyroxene3_sword;
    public static Item pyroxene3_shovel;
    public static Item pyroxene3_hoe;

    public static void init() {
        pyroxene_pickaxe = new ItemPyroxenePickaxe();
        pyroxene_axe = new ItemPyroxeneAxe();
        pyroxene_sword = new ItemPyroxeneSword();
        pyroxene_shovel = new ItemPyroxeneShovel();
        pyroxene_hoe = new ItemPyroxeneHoe();
        pyroxene2_pickaxe = new ItemPyroxene2Pickaxe();
        pyroxene2_axe = new ItemPyroxene2Axe();
        pyroxene2_sword = new ItemPyroxene2Sword();
        pyroxene2_shovel = new ItemPyroxene2Shovel();
        pyroxene2_hoe = new ItemPyroxene2Hoe();
        pyroxene3_pickaxe = new ItemPyroxene3Pickaxe();
        pyroxene3_axe = new ItemPyroxene3Axe();
        pyroxene3_sword = new ItemPyroxene3Sword();
        pyroxene3_shovel = new ItemPyroxene3Shovel();
        pyroxene3_hoe = new ItemPyroxene3Hoe();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            pyroxene_pickaxe, pyroxene_axe, pyroxene_sword, pyroxene_shovel, pyroxene_hoe,
            pyroxene2_pickaxe, pyroxene2_axe, pyroxene2_sword, pyroxene2_shovel, pyroxene2_hoe,
            pyroxene3_pickaxe, pyroxene3_axe, pyroxene3_sword, pyroxene3_shovel, pyroxene3_hoe
        );
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
        ModelLoader.setCustomModelResourceLocation(pyroxene2_pickaxe, 0, 
            new ModelResourceLocation(pyroxene2_pickaxe.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene2_axe, 0, 
            new ModelResourceLocation(pyroxene2_axe.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene2_sword, 0, 
            new ModelResourceLocation(pyroxene2_sword.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene2_shovel, 0, 
            new ModelResourceLocation(pyroxene2_shovel.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene2_hoe, 0, 
            new ModelResourceLocation(pyroxene2_hoe.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene3_pickaxe, 0, 
            new ModelResourceLocation(pyroxene3_pickaxe.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene3_axe, 0, 
            new ModelResourceLocation(pyroxene3_axe.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene3_sword, 0, 
            new ModelResourceLocation(pyroxene3_sword.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene3_shovel, 0, 
            new ModelResourceLocation(pyroxene3_shovel.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene3_hoe, 0, 
            new ModelResourceLocation(pyroxene3_hoe.getRegistryName(), "inventory"));
    }
}

