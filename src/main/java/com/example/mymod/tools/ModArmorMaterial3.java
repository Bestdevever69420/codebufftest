package com.example.mymod.tools;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Pyroxene3 - Cyan/Teal Armor
 * Tier: Between Iron and Diamond (same as Pyroxene1 but different trade-offs)
 * Strength: Balanced protection and durability - good at everything
 * Weakness: Moderate enchantability - not the best for enchanting
 * 
 * Balance Philosophy: All-rounder armor - no extreme strengths or weaknesses
 */
public class ModArmorMaterial3 {
    // Pyroxene3: Balanced armor - between iron and diamond in all stats
    // Trade-off: No extreme stats, but no major weakness either
    public static final ItemArmor.ArmorMaterial PYROXENE3 = EnumHelper.addArmorMaterial(
        "PYROXENE3",
        "mymod:pyroxene3",
        25, // durability: between iron (15) and diamond (33)
        new int[]{3, 6, 8, 3}, // damage reduction: same as diamond
        12, // enchantability: moderate - between iron (14) and diamond (10)
        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
        2.0F // toughness: same as diamond (2.0)
    );
}