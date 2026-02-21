package com.example.mymod;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.example.mymod.blocks.TileEntityPyroxeneFurnace;
import com.example.mymod.entity.EntityPyroxeneBoat;
import com.example.mymod.entity.EntityPyroxene2Boat;
import com.example.mymod.entity.EntityPyroxene3Boat;
import com.example.mymod.entity.RenderPyroxeneBoat;
import com.example.mymod.entity.RenderPyroxene2Boat;
import com.example.mymod.entity.RenderPyroxene3Boat;
import com.example.mymod.init.*;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;
import com.example.mymod.world.BiomePyroxene;
import com.example.mymod.world.BiomePyroxeneDesert;
import com.example.mymod.world.BiomePyroxeneOcean;
import com.example.mymod.world.BiomePyroxeneMountains;
import com.example.mymod.world.WorldGenPyroxeneOre;
import com.example.mymod.world.WorldGenPyroxeneMineshaft;
import net.minecraftforge.common.BiomeManager;

@Mod(modid = MyMod.MODID, name = MyMod.NAME, version = MyMod.VERSION)
public class MyMod {
    public static final String MODID = "mymod";
    public static final String NAME = "My Mod";
    public static final String VERSION = "1.1.0.3";

    @Mod.Instance(MODID)
    public static MyMod instance;

    public static final MyModCreativeTab CREATIVE_TAB = new MyModCreativeTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        ModItems.init();
        ModTools.init();
        ModArmor.init();

        // Register TileEntity
        GameRegistry.registerTileEntity(TileEntityPyroxeneFurnace.class,
                MODID + ":pyroxene_furnace");

        // Set repair materials
        com.example.mymod.tools.ModMaterial.PYROXENE.setRepairItem(
            new ItemStack(ModItems.pyroxene_ingot));
        com.example.mymod.tools.ModArmorMaterial.PYROXENE.setRepairItem(
            new ItemStack(ModItems.pyroxene_ingot));
        com.example.mymod.tools.ModMaterial2.PYROXENE2.setRepairItem(
            new ItemStack(ModItems.pyroxene2_ingot));
        com.example.mymod.tools.ModArmorMaterial2.PYROXENE2.setRepairItem(
            new ItemStack(ModItems.pyroxene2_ingot));
        com.example.mymod.tools.ModMaterial3.PYROXENE3.setRepairItem(
            new ItemStack(ModItems.pyroxene3_ingot));
        com.example.mymod.tools.ModArmorMaterial3.PYROXENE3.setRepairItem(
            new ItemStack(ModItems.pyroxene3_ingot));
    }

    public static Biome pyroxene_biome;
    public static Biome pyroxene_desert_biome;
    public static Biome pyroxene_ocean_biome;
    public static Biome pyroxene_mountains_biome;

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
        GameRegistry.registerWorldGenerator(new WorldGenPyroxeneOre(), 3);
        GameRegistry.registerWorldGenerator(new WorldGenPyroxeneMineshaft(), 2);
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
        
        // Register Pyroxene Forest biome
        pyroxene_biome = new BiomePyroxene();
        pyroxene_biome.setRegistryName("pyroxene_forest");
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(pyroxene_biome, 10));
        
        // Register Pyroxene Desert biome
        pyroxene_desert_biome = new BiomePyroxeneDesert();
        pyroxene_desert_biome.setRegistryName("pyroxene_desert");
        BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(pyroxene_desert_biome, 5));
        
        // Register Pyroxene Ocean biome
        pyroxene_ocean_biome = new BiomePyroxeneOcean();
        pyroxene_ocean_biome.setRegistryName("pyroxene_ocean");
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(pyroxene_ocean_biome, 3));
        
        // Register Pyroxene Mountains biome
        pyroxene_mountains_biome = new BiomePyroxeneMountains();
        pyroxene_mountains_biome.setRegistryName("pyroxene_mountains");
        BiomeManager.addBiome(BiomeManager.BiomeType.ICY, new BiomeManager.BiomeEntry(pyroxene_mountains_biome, 5));
        
        // Add pyroxene items to dungeon loot tables
        LootTableList.register(new ResourceLocation(MODID, "pyroxene_ores"));
        LootTableList.register(new ResourceLocation(MODID, "pyroxene_treasure"));
        
        // Register custom boat entities and renderers
        EntityRegistry.registerModEntity(new net.minecraft.util.ResourceLocation(MODID, "pyroxene_boat"), EntityPyroxeneBoat.class, "pyroxene_boat", 0, instance, 64, 20, true);
        RenderingRegistry.registerEntityRenderingHandler(EntityPyroxeneBoat.class, manager -> new RenderPyroxeneBoat(manager));
        EntityRegistry.registerModEntity(new net.minecraft.util.ResourceLocation(MODID, "pyroxene2_boat"), EntityPyroxene2Boat.class, "pyroxene2_boat", 1, instance, 64, 20, true);
        RenderingRegistry.registerEntityRenderingHandler(EntityPyroxene2Boat.class, manager -> new RenderPyroxene2Boat(manager));
        EntityRegistry.registerModEntity(new net.minecraft.util.ResourceLocation(MODID, "pyroxene3_boat"), EntityPyroxene3Boat.class, "pyroxene3_boat", 2, instance, 64, 20, true);
        RenderingRegistry.registerEntityRenderingHandler(EntityPyroxene3Boat.class, manager -> new RenderPyroxene3Boat(manager));
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
