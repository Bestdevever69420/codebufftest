package com.example.mymod.tools;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmorMaterial {
    // Armor material: slightly better protection than diamond, lower durability
    // Diamond: durability multiplier 33, damage reduction [3,6,8,3], enchantability 10, toughness 2.0
    // Pyroxene: durability multiplier 28, damage reduction [3,6,8,3], enchantability 15, toughness 2.5
    public static final ItemArmor.ArmorMaterial PYROXENE = EnumHelper.addArmorMaterial(
        "PYROXENE",
        "mymod:pyroxene",
        28, // durability multiplier (lower than diamond's 33)
        new int[]{3, 6, 8, 3}, // damage reduction per piece [helmet, chestplate, leggings, boots]
        15, // enchantability (higher than diamond's 10)
        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
        2.5F // toughness (higher than diamond's 2.0)
    );
}
