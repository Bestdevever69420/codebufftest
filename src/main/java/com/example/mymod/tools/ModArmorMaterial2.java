package com.example.mymod.tools;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Pyroxene2 - Orange/Amber Armor
 * Tier: Diamond tier
 * Strength: Very high protection and durability
 * Weakness: Very low enchantability - harder to optimize
 * 
 * Balance Philosophy: Tanky but hard to enchant
 */
public class ModArmorMaterial2 {
    // Pyroxene2: Diamond-tier protection with extreme durability
    // Trade-off: Very low enchantability
    public static final ItemArmor.ArmorMaterial PYROXENE2 = EnumHelper.addArmorMaterial(
        "PYROXENE2",
        "mymod:pyroxene2",
        45, // durability: significantly higher than diamond (33)
        new int[]{4, 8, 10, 4}, // armor: better than diamond [3,6,8,3]
        5, // enchantability: very low - harder to enchant than diamond (10)
        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
        3.5F // toughness: higher than diamond (2.0)
    );
}
