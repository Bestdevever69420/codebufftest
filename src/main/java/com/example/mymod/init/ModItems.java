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
import com.example.mymod.items.ItemPyroxeneBoat;
import com.example.mymod.items.ItemPyroxene2Ingot;
import com.example.mymod.items.ItemPyroxene2Boat;
import com.example.mymod.items.ItemPyroxene3Ingot;
import com.example.mymod.items.ItemPyroxene3Boat;

@Mod.EventBusSubscriber(modid = MyMod.MODID)
public class ModItems {
    public static Item pyroxene_ingot;
    public static Item pyroxene_nugget;
    public static Item pyroxene_boat;
    public static Item pyroxene2_ingot;
    public static Item pyroxene2_boat;
    public static Item pyroxene3_ingot;
    public static Item pyroxene3_boat;

    public static void init() {
        pyroxene_ingot = new ItemPyroxeneIngot();
        pyroxene_nugget = new ItemPyroxeneNugget();
        pyroxene_boat = new ItemPyroxeneBoat();
        pyroxene2_ingot = new ItemPyroxene2Ingot();
        pyroxene2_boat = new ItemPyroxene2Boat();
        pyroxene3_ingot = new ItemPyroxene3Ingot();
        pyroxene3_boat = new ItemPyroxene3Boat();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(pyroxene_ingot, pyroxene_nugget, pyroxene_boat, pyroxene2_ingot, pyroxene2_boat, pyroxene3_ingot, pyroxene3_boat);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(pyroxene_ingot, 0, 
            new ModelResourceLocation(pyroxene_ingot.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene_nugget, 0, 
            new ModelResourceLocation(pyroxene_nugget.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene_boat, 0,
            new ModelResourceLocation(pyroxene_boat.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene2_ingot, 0, 
            new ModelResourceLocation(pyroxene2_ingot.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene2_boat, 0,
            new ModelResourceLocation(pyroxene2_boat.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene3_ingot, 0, 
            new ModelResourceLocation(pyroxene3_ingot.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(pyroxene3_boat, 0,
            new ModelResourceLocation(pyroxene3_boat.getRegistryName(), "inventory"));
    }
}

