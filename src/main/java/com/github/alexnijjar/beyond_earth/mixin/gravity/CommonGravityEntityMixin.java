package com.github.alexnijjar.beyond_earth.mixin.gravity;

import com.github.alexnijjar.beyond_earth.util.ModUtils;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;

@Mixin({ AbstractMinecartEntity.class, ItemEntity.class, TntEntity.class })
public abstract class CommonGravityEntityMixin {
    @ModifyConstant(method = "tick", constant = @Constant(doubleValue = -0.04))
    public double setGravity(double value) {
        return ModUtils.getMixinGravity(value, this);
    }
}