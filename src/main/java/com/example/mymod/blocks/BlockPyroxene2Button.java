package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockButton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockPyroxene2Button extends BlockButton {
    public BlockPyroxene2Button() {
        super(true);
        setRegistryName("pyroxene2_button");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_button");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(0.5F);
        setResistance(0.5F);
    }

    @Override
    protected void playClickSound(EntityPlayer player, World worldIn, BlockPos pos) {
        worldIn.playSound(null, pos, net.minecraft.init.SoundEvents.BLOCK_WOOD_BUTTON_CLICK_ON, SoundCategory.BLOCKS, 0.3F, 0.6F);
    }

    @Override
    protected void playReleaseSound(World worldIn, BlockPos pos) {
        worldIn.playSound(null, pos, net.minecraft.init.SoundEvents.BLOCK_WOOD_BUTTON_CLICK_OFF, SoundCategory.BLOCKS, 0.3F, 0.5F);
    }
}
