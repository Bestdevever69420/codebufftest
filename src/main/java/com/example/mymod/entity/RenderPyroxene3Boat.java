package com.example.mymod.entity;

import com.example.mymod.MyMod;
import net.minecraft.client.renderer.entity.RenderBoat;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.util.ResourceLocation;

public class RenderPyroxene3Boat extends RenderBoat {
    private static final ResourceLocation BOAT_TEXTURES = new ResourceLocation(MyMod.MODID, "textures/entity/boat/pyroxene3_boat.png");

    public RenderPyroxene3Boat(RenderManager renderManagerIn) {
        super(renderManagerIn);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityBoat entity) {
        return BOAT_TEXTURES;
    }
}