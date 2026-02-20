package com.example.mymod;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.example.mymod.blocks.TileEntityPyroxeneFurnace;
import com.example.mymod.init.*;
import com.example.mymod.world.WorldGenPyroxeneOre;

@Mod(modid = MyMod.MODID, name = MyMod.NAME, version = MyMod.VERSION)
public class MyMod {
    public static final String MODID = "mymod";
    public static final String NAME = "My Mod";
    public static final String VERSION = "1.0.0";

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
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
        GameRegistry.registerWorldGenerator(new WorldGenPyroxeneOre(), 3);
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
