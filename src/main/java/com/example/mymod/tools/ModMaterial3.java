package com.example.mymod.tools;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Pyroxene3 - Cyan/Teal Material
 * Tier: Between Iron and Diamond (same as Pyroxene1 but different trade-offs)
 * Strength: Balanced durability AND efficiency - no major weakness
 * Weakness: Moderate enchantability - not the best for enchanting
 * 
 * Balance Philosophy: All-rounder - good at everything, great at nothing
 */
public class ModMaterial3 {
    // Pyroxene3: Balanced material - moderate stats in all categories
    // Trade-off: No extreme stats, but no major weakness either
    public static final Item.ToolMaterial PYROXENE3 = EnumHelper.addToolMaterial(
        "PYROXENE3",
        2, // harvest level (same as iron - can mine iron but not diamond blocks)
        600, // durability: significantly better than iron (250), less than diamond (1561)
        8.0F, // efficiency: equal to diamond (8.0)
        3.5F, // attack damage: slightly higher than standard
        12 // enchantability: between iron (14) and diamond (10) - moderate
    );
}