package com.example.mymod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.example.mymod.MyMod;

public class ModRecipes {
    public static void init() {
        // Ingot from block (shapeless - unpack)
        GameRegistry.addShapelessRecipe(
            new ResourceLocation(MyMod.MODID, "pyroxene_ingot_from_block"),
            new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModItems.pyroxene_ingot, 9),
            Ingredient.fromStacks(new ItemStack(ModBlocks.pyroxene_block)));

        // Block from ingots
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_block"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_block),
            "III",
            "III",
            "III",
            'I', ModItems.pyroxene_ingot);

        // Nugget from ingot (shapeless - unpack)
        GameRegistry.addShapelessRecipe(
            new ResourceLocation(MyMod.MODID, "pyroxene_nugget_from_ingot"),
            new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModItems.pyroxene_nugget, 9),
            Ingredient.fromStacks(new ItemStack(ModItems.pyroxene_ingot)));

        // Ingot from nuggets
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_ingot_from_nuggets"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModItems.pyroxene_ingot),
            "NNN",
            "NNN",
            "NNN",
            'N', ModItems.pyroxene_nugget);

        // --- Decorative Blocks ---

        // Bricks (2x2 pyroxene blocks = 4 bricks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_bricks"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_bricks, 4),
            "BB",
            "BB",
            'B', ModBlocks.pyroxene_block);

        // Pillar (2 pyroxene blocks stacked = 2 pillars)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_pillar"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_pillar, 2),
            "B",
            "B",
            'B', ModBlocks.pyroxene_block);

        // Slab (3 pyroxene blocks in a row = 6 slabs)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_slab"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_slab, 6),
            "BBB",
            'B', ModBlocks.pyroxene_block);

        // Stairs (6 pyroxene blocks = 4 stairs)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_stairs"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_stairs, 4),
            "B  ",
            "BB ",
            "BBB",
            'B', ModBlocks.pyroxene_block);

        // Lamp (pyroxene block + glowstone dust)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_lamp"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_lamp, 4),
            " G ",
            "GBG",
            " G ",
            'B', ModBlocks.pyroxene_block,
            'G', Items.GLOWSTONE_DUST);

        // --- Furnace ---

        // Pyroxene Furnace (like vanilla furnace but with pyroxene blocks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_furnace"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_furnace),
            "BBB",
            "B B",
            "BBB",
            'B', ModBlocks.pyroxene_block);

        // --- Tools ---

        // Pickaxe
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_pickaxe"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene_pickaxe),
            "III",
            " S ",
            " S ",
            'I', ModItems.pyroxene_ingot,
            'S', Items.STICK);

        // Axe
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_axe"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene_axe),
            "II",
            "IS",
            " S",
            'I', ModItems.pyroxene_ingot,
            'S', Items.STICK);

        // Sword
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_sword"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene_sword),
            "I",
            "I",
            "S",
            'I', ModItems.pyroxene_ingot,
            'S', Items.STICK);

        // Shovel
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_shovel"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene_shovel),
            "I",
            "S",
            "S",
            'I', ModItems.pyroxene_ingot,
            'S', Items.STICK);

        // Hoe
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_hoe"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene_hoe),
            "II",
            " S",
            " S",
            'I', ModItems.pyroxene_ingot,
            'S', Items.STICK);

        // --- Armor ---

        // Helmet
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_helmet"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene_helmet),
            "III",
            "I I",
            'I', ModItems.pyroxene_ingot);

        // Chestplate
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_chestplate"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene_chestplate),
            "I I",
            "III",
            "III",
            'I', ModItems.pyroxene_ingot);

        // Leggings
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_leggings"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene_leggings),
            "III",
            "I I",
            "I I",
            'I', ModItems.pyroxene_ingot);

        // Boots
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_boots"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene_boots),
            "I I",
            "I I",
            'I', ModItems.pyroxene_ingot);

        // --- Pyroxene Wood & Planks ---

        // Planks from wood (4 planks per wood log)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_planks_from_wood"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_planks, 4),
            "W",
            'W', ModBlocks.pyroxene_wood);

        // Planks stairs (4 stairs from 6 planks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_planks_stairs"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_planks_stairs, 4),
            "P  ",
            "PP ",
            "PPP",
            'P', ModBlocks.pyroxene_planks);

        // Planks slab (6 slabs from 3 planks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_planks_slab"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_planks_slab, 6),
            "PPP",
            'P', ModBlocks.pyroxene_planks);

        // --- Pyroxene Fence & Gate ---

        // Fence (4 fences from 4 planks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_fence"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_fence, 4),
            "PSP",
            "PSP",
            'P', ModBlocks.pyroxene_planks,
            'S', Items.STICK);

        // Fence gate (2 gates from 4 sticks and 2 planks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_fence_gate"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_fence_gate, 2),
            "SPS",
            "SPS",
            'P', ModBlocks.pyroxene_planks,
            'S', Items.STICK);

        // --- Pyroxene Door & Trapdoor ---

        // Door (2 doors from 6 planks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_door"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_door, 2),
            "PP",
            "PP",
            "PP",
            'P', ModBlocks.pyroxene_planks);

        // Trapdoor (2 trapdoors from 4 planks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_trapdoor"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_trapdoor, 2),
            "PP",
            "PP",
            'P', ModBlocks.pyroxene_planks);

        // --- Redstone Components ---

        // Button (1 button from 1 plank)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_button"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_button),
            "P",
            'P', ModBlocks.pyroxene_planks);

        // Pressure plate (1 pressure plate from 2 planks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_pressure_plate"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_pressure_plate),
            "PP",
            'P', ModBlocks.pyroxene_planks);

        // --- Boat ---

        // Boat (1 boat from 5 planks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_boat"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModItems.pyroxene_boat),
            "P P",
            "PPP",
            'P', ModBlocks.pyroxene_planks);

        // --- More Wood/Planks Recipes ---

        // Wood logs to charcoal (smelting)
        GameRegistry.addSmelting(new ItemStack(ModBlocks.pyroxene_wood), new ItemStack(Items.COAL, 1, 1), 0.15F);

        // Stick from planks (4 sticks from 2 planks - like vanilla)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_stick"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(Items.STICK, 4),
            "P",
            "P",
            'P', ModBlocks.pyroxene_planks);

        // Sign (3 signs from 6 planks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_sign"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(Items.SIGN, 3),
            "PPP",
            "PPP",
            " S ",
            'P', ModBlocks.pyroxene_planks,
            'S', Items.STICK);

        // Bowl (4 bowls from 6 planks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_bowl"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(Items.BOWL, 4),
            "P P",
            " P ",
            'P', ModBlocks.pyroxene_planks);

        // --- Smelting ---

        // Ore to ingot
        GameRegistry.addSmelting(ModBlocks.pyroxene_ore, new ItemStack(ModItems.pyroxene_ingot), 1.0F);

        // ==================== PYROXENE2 RECIPES ====================
        // Pyroxene2: Orange/Amber themed - tier above diamond

        // --- Pyroxene2 Block/Ingot Conversions ---

        // Ingot from block (shapeless - unpack)
        GameRegistry.addShapelessRecipe(
            new ResourceLocation(MyMod.MODID, "pyroxene2_ingot_from_block"),
            new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModItems.pyroxene2_ingot, 9),
            Ingredient.fromStacks(new ItemStack(ModBlocks.pyroxene2_block)));

        // Block from ingots
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_block"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene2_block),
            "III",
            "III",
            "III",
            'I', ModItems.pyroxene2_ingot);

        // --- Pyroxene2 Decorative Blocks ---

        // Bricks (2x2 pyroxene2 blocks = 4 bricks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_bricks"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene2_bricks, 4),
            "BB",
            "BB",
            'B', ModBlocks.pyroxene2_block);

        // --- Pyroxene2 Tools ---

        // Pickaxe
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_pickaxe"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene2_pickaxe),
            "III",
            " S ",
            " S ",
            'I', ModItems.pyroxene2_ingot,
            'S', Items.STICK);

        // Axe
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_axe"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene2_axe),
            "II",
            "IS",
            " S",
            'I', ModItems.pyroxene2_ingot,
            'S', Items.STICK);

        // Sword
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_sword"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene2_sword),
            "I",
            "I",
            "S",
            'I', ModItems.pyroxene2_ingot,
            'S', Items.STICK);

        // Shovel
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_shovel"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene2_shovel),
            "I",
            "S",
            "S",
            'I', ModItems.pyroxene2_ingot,
            'S', Items.STICK);

        // Hoe
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_hoe"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene2_hoe),
            "II",
            " S",
            " S",
            'I', ModItems.pyroxene2_ingot,
            'S', Items.STICK);

        // --- Pyroxene2 Armor ---

        // Helmet
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_helmet"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene2_helmet),
            "III",
            "I I",
            'I', ModItems.pyroxene2_ingot);

        // Chestplate
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_chestplate"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene2_chestplate),
            "I I",
            "III",
            "III",
            'I', ModItems.pyroxene2_ingot);

        // Leggings
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_leggings"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene2_leggings),
            "III",
            "I I",
            "I I",
            'I', ModItems.pyroxene2_ingot);

        // Boots
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_boots"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene2_boots),
            "I I",
            "I I",
            'I', ModItems.pyroxene2_ingot);

        // --- Pyroxene2 Smelting ---

        // Ore to ingot
        GameRegistry.addSmelting(ModBlocks.pyroxene2_ore, new ItemStack(ModItems.pyroxene2_ingot), 1.5F);

        // --- Pyroxene2 Wood & Planks ---

        // Planks from wood
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_planks_from_wood"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene2_planks, 4),
            "W",
            'W', ModBlocks.pyroxene2_wood);

        // Planks stairs
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_planks_stairs"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene2_planks_stairs, 4),
            "P  ",
            "PP ",
            "PPP",
            'P', ModBlocks.pyroxene2_planks);

        // Planks slab
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_planks_slab"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene2_planks_slab, 6),
            "PPP",
            'P', ModBlocks.pyroxene2_planks);

        // Fence
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_fence"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene2_fence, 4),
            "PSP",
            "PSP",
            'P', ModBlocks.pyroxene2_planks,
            'S', Items.STICK);

        // Fence gate
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_fence_gate"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene2_fence_gate, 2),
            "SPS",
            "SPS",
            'P', ModBlocks.pyroxene2_planks,
            'S', Items.STICK);

        // Door
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_door"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene2_door, 2),
            "PP",
            "PP",
            "PP",
            'P', ModBlocks.pyroxene2_planks);

        // Trapdoor
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_trapdoor"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene2_trapdoor, 2),
            "PP",
            "PP",
            'P', ModBlocks.pyroxene2_planks);

        // Button
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_button"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene2_button),
            "P",
            'P', ModBlocks.pyroxene2_planks);

        // Pressure plate
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_pressure_plate"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene2_pressure_plate),
            "PP",
            'P', ModBlocks.pyroxene2_planks);

        // Boat
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene2_boat"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModItems.pyroxene2_boat),
            "P P",
            "PPP",
            'P', ModBlocks.pyroxene2_planks);

        // ==================== PYROXENE3 RECIPES ====================
        // Pyroxene3: Cyan/Teal themed - balanced mid-tier material

        // --- Pyroxene3 Block/Ingot Conversions ---

        // Ingot from block (shapeless - unpack)
        GameRegistry.addShapelessRecipe(
            new ResourceLocation(MyMod.MODID, "pyroxene3_ingot_from_block"),
            new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModItems.pyroxene3_ingot, 9),
            Ingredient.fromStacks(new ItemStack(ModBlocks.pyroxene3_block)));

        // Block from ingots
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_block"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene3_block),
            "III",
            "III",
            "III",
            'I', ModItems.pyroxene3_ingot);

        // --- Pyroxene3 Decorative Blocks ---

        // Bricks (2x2 pyroxene3 blocks = 4 bricks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_bricks"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene3_bricks, 4),
            "BB",
            "BB",
            'B', ModBlocks.pyroxene3_block);

        // --- Pyroxene3 Tools ---

        // Pickaxe
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_pickaxe"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene3_pickaxe),
            "III",
            " S ",
            " S ",
            'I', ModItems.pyroxene3_ingot,
            'S', Items.STICK);

        // Axe
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_axe"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene3_axe),
            "II",
            "IS",
            " S",
            'I', ModItems.pyroxene3_ingot,
            'S', Items.STICK);

        // Sword
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_sword"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene3_sword),
            "I",
            "I",
            "S",
            'I', ModItems.pyroxene3_ingot,
            'S', Items.STICK);

        // Shovel
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_shovel"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene3_shovel),
            "I",
            "S",
            "S",
            'I', ModItems.pyroxene3_ingot,
            'S', Items.STICK);

        // Hoe
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_hoe"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene3_hoe),
            "II",
            " S",
            " S",
            'I', ModItems.pyroxene3_ingot,
            'S', Items.STICK);

        // --- Pyroxene3 Armor ---

        // Helmet
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_helmet"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene3_helmet),
            "III",
            "I I",
            'I', ModItems.pyroxene3_ingot);

        // Chestplate
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_chestplate"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene3_chestplate),
            "I I",
            "III",
            "III",
            'I', ModItems.pyroxene3_ingot);

        // Leggings
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_leggings"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene3_leggings),
            "III",
            "I I",
            "I I",
            'I', ModItems.pyroxene3_ingot);

        // Boots
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_boots"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene3_boots),
            "I I",
            "I I",
            'I', ModItems.pyroxene3_ingot);

        // --- Pyroxene3 Smelting ---

        // Ore to ingot
        GameRegistry.addSmelting(ModBlocks.pyroxene3_ore, new ItemStack(ModItems.pyroxene3_ingot), 1.25F);

        // --- Pyroxene3 Wood & Planks ---

        // Planks from wood
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_planks_from_wood"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene3_planks, 4),
            "W",
            'W', ModBlocks.pyroxene3_wood);

        // Planks stairs
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_planks_stairs"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene3_planks_stairs, 4),
            "P  ",
            "PP ",
            "PPP",
            'P', ModBlocks.pyroxene3_planks);

        // Planks slab
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_planks_slab"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene3_planks_slab, 6),
            "PPP",
            'P', ModBlocks.pyroxene3_planks);

        // Fence
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_fence"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene3_fence, 4),
            "PSP",
            "PSP",
            'P', ModBlocks.pyroxene3_planks,
            'S', Items.STICK);

        // Fence gate
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_fence_gate"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene3_fence_gate, 2),
            "SPS",
            "SPS",
            'P', ModBlocks.pyroxene3_planks,
            'S', Items.STICK);

        // Door
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_door"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene3_door, 2),
            "PP",
            "PP",
            "PP",
            'P', ModBlocks.pyroxene3_planks);

        // Trapdoor
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_trapdoor"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene3_trapdoor, 2),
            "PP",
            "PP",
            'P', ModBlocks.pyroxene3_planks);

        // Button
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_button"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene3_button),
            "P",
            'P', ModBlocks.pyroxene3_planks);

        // Pressure plate
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_pressure_plate"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene3_pressure_plate),
            "PP",
            'P', ModBlocks.pyroxene3_planks);

        // Boat
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene3_boat"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModItems.pyroxene3_boat),
            "P P",
            "PPP",
            'P', ModBlocks.pyroxene3_planks);
    }
}
