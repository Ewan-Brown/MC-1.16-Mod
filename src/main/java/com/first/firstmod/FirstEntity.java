package com.first.firstmod;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.entity.PartEntity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class FirstEntity extends AnimalEntity {
    protected FirstEntity(EntityType<? extends AnimalEntity> p_i48568_1_, World p_i48568_2_) {
        super(p_i48568_1_, p_i48568_2_);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
        return null;
    }

    @Override
    public Entity getEntity() {
        return null;
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {

    }

    @Override
    public CompoundNBT serializeNBT() {
        return null;
    }

    @Override
    public boolean shouldRiderSit() {
        return false;
    }

    @Override
    public ItemStack getPickedResult(RayTraceResult target) {
        return null;
    }

    @Override
    public boolean canRiderInteract() {
        return false;
    }

    @Override
    public boolean canBeRiddenInWater(Entity rider) {
        return false;
    }

    @Override
    public EntityClassification getClassification(boolean forSpawnCount) {
        return null;
    }

    @Override
    public boolean isMultipartEntity() {
        return false;
    }

    @Nullable
    @Override
    public PartEntity<?>[] getParts() {
        return new PartEntity[0];
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap) {
        return null;
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.MOVEMENT_SPEED, (double)0.2F);
    }
}
