package com.example.mymod;

import com.example.mymod.blocks.ContainerPyroxeneFurnace;
import com.example.mymod.blocks.GuiPyroxeneFurnace;
import com.example.mymod.blocks.TileEntityPyroxeneFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

    public static final int PYROXENE_FURNACE_GUI_ID = 0;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

        if (ID == PYROXENE_FURNACE_GUI_ID) {
            if (tileEntity instanceof TileEntityPyroxeneFurnace) {
                return new ContainerPyroxeneFurnace(player.inventory, (TileEntityPyroxeneFurnace) tileEntity);
            }
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

        if (ID == PYROXENE_FURNACE_GUI_ID) {
            if (tileEntity instanceof TileEntityPyroxeneFurnace) {
                return new GuiPyroxeneFurnace(player.inventory, (TileEntityPyroxeneFurnace) tileEntity);
            }
        }

        return null;
    }
}
