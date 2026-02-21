package com.example.mymod.items;

import com.example.mymod.MyMod;
import com.example.mymod.entity.EntityPyroxene2Boat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemPyroxene2Boat extends Item {
    public ItemPyroxene2Boat() {
        setRegistryName("pyroxene2_boat");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_boat");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (facing == EnumFacing.DOWN) {
            return EnumActionResult.FAIL;
        }
        
        pos = pos.offset(facing);
        
        if (!player.canPlayerEdit(pos, facing, player.getHeldItem(hand))) {
            return EnumActionResult.FAIL;
        }
        
        if (worldIn.isRemote) {
            return EnumActionResult.SUCCESS;
        }
        
        EntityPyroxene2Boat boat = new EntityPyroxene2Boat(worldIn, pos.getX() + 0.5, pos.getY() - 0.3, pos.getZ() + 0.5);
        boat.rotationYaw = player.rotationYaw;
        worldIn.spawnEntity(boat);
        
        if (!player.isCreative()) {
            player.getHeldItem(hand).shrink(1);
        }
        
        return EnumActionResult.SUCCESS;
    }
}
