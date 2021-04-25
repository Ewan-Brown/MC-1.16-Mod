package com.example.examplemod;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.CowModel;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.util.ResourceLocation;

public class FirstRenderer extends MobRenderer<FirstEntity, FirstModel<FirstEntity>> {
    private static final ResourceLocation COW_LOCATION = new ResourceLocation("textures/entity/cow/cow.png");

    public FirstRenderer(EntityRendererManager p_i47210_1_) {
        super(p_i47210_1_, new FirstModel<>(), 0.7F);
    }

    public ResourceLocation getTextureLocation(FirstEntity p_110775_1_) {
        return COW_LOCATION;
    }
}
