package com.example.mymod.blocks;

import com.example.mymod.MyMod;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiPyroxeneFurnace extends GuiContainer {

    private static final ResourceLocation FURNACE_GUI_TEXTURE = new ResourceLocation(MyMod.MODID,
            "textures/gui/pyroxene_furnace_gui.png");

    private final IInventory tileFurnace;
    private final InventoryPlayer playerInventory;

    public GuiPyroxeneFurnace(InventoryPlayer playerInventory, IInventory furnaceInventory) {
        super(new ContainerPyroxeneFurnace(playerInventory, furnaceInventory));
        this.playerInventory = playerInventory;
        this.tileFurnace = furnaceInventory;
        this.xSize = 176;
        this.ySize = 166;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        String s = this.tileFurnace.getDisplayName().getUnformattedText();
        this.fontRenderer.drawString(s, this.xSize / 2 - this.fontRenderer.getStringWidth(s) / 2, 6, 4210752);
        this.fontRenderer.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(FURNACE_GUI_TEXTURE);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);

        // Draw fire indicator (burn progress)
        if (this.isBurning()) {
            int burnLeft = this.getBurnLeftScaled(13);
            this.drawTexturedModalRect(i + 56, j + 36 + 12 - burnLeft, 176, 12 - burnLeft, 14, burnLeft + 1);
        }

        // Draw cook/smelt progress arrow
        int cookProgress = this.getCookProgressScaled(24);
        this.drawTexturedModalRect(i + 79, j + 34, 176, 14, cookProgress + 1, 16);
    }

    private boolean isBurning() {
        return this.tileFurnace.getField(0) > 0;
    }

    private int getBurnLeftScaled(int pixels) {
        int currentBurnTime = this.tileFurnace.getField(1);
        if (currentBurnTime == 0) {
            currentBurnTime = TileEntityPyroxeneFurnace.COOK_TIME;
        }
        return this.tileFurnace.getField(0) * pixels / currentBurnTime;
    }

    private int getCookProgressScaled(int pixels) {
        int cookTime = this.tileFurnace.getField(2);
        int totalCookTime = this.tileFurnace.getField(3);
        return totalCookTime != 0 && cookTime != 0 ? cookTime * pixels / totalCookTime : 0;
    }
}
