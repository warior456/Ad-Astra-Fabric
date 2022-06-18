package com.github.alexnijjar.beyond_earth.items.armour;

import java.util.List;

import com.github.alexnijjar.beyond_earth.registry.ModArmour;
import com.github.alexnijjar.beyond_earth.util.ModKeyBindings;
import com.github.alexnijjar.beyond_earth.util.ModUtils;

import net.fabricmc.fabric.api.entity.event.v1.FabricElytraItem;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidConstants;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import team.reborn.energy.api.base.SimpleBatteryItem;

public class JetSuit extends NetheriteSpaceSuit implements SimpleBatteryItem, FabricElytraItem {

    // 0.2M E.
    public static final long MAX_ENERGY = 200000;
    public static final double SPEED = 0.5;
    public boolean isFallFlying;

    public JetSuit(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public long getTankSize() {
        return 4 * FluidConstants.BUCKET;
    }

    @Override
    public boolean useCustomElytra(LivingEntity entity, ItemStack chestStack, boolean tickElytra) {
        return this.isFallFlying;
    }

    // Display energy.
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        if (stack.isOf(ModArmour.JET_SUIT)) {
            long energy = this.getStoredEnergy(stack);
            tooltip.add(Text.translatable("gauge_text.beyond_earth.storage", energy, MAX_ENERGY).setStyle(Style.EMPTY.withColor(energy > 0 ? Formatting.GREEN : Formatting.RED)));
        }
    }

    public void fly(PlayerEntity player, ItemStack stack) {
        // Don't fly the Jet Suit in creative.
        if (player.getAbilities().flying) {
            return;
        }

        // Don't fly if the Jet Suit has no energy.
        if (this.getStoredEnergy(stack) <= 0) {
            return;
        }

        if (ModKeyBindings.sprintKeyDown(player)) {
            this.fallFly(player, stack);
        } else {
            this.hover(player, stack);
        }

        if (!player.world.isClient) {
            if (isFallFlying) {
                if (!player.isFallFlying()) {
                    player.startFallFlying();
                }
            } else {
                if (player.isFallFlying()) {
                    player.stopFallFlying();
                }
            }

            this.spawnParticles(player, stack);
        }

    }

    public void hover(PlayerEntity player, ItemStack stack) {
        this.tryUseEnergy(stack, 6);
        isFallFlying = false;

        double speed = ModUtils.getPlanetGravity(player.world) * 0.25;
        player.setVelocity(player.getVelocity().add(0.0, speed, 0.0));
        if (player.getVelocity().getY() > speed * 10) {
            player.setVelocity(player.getVelocity().getX(), speed * 10, player.getVelocity().getZ());
        }
    }

    public void fallFly(PlayerEntity player, ItemStack stack) {
        this.tryUseEnergy(stack, 12);
        isFallFlying = true;

        Vec3d rotationVector = player.getRotationVector().multiply(SPEED);
        Vec3d velocity = player.getVelocity();
        player.setVelocity(velocity.add(rotationVector.getX() * 0.1 + (rotationVector.getX() * 1.5 - velocity.getX()) * 0.5, rotationVector.getY() * 0.1 + (rotationVector.getY() * 1.5 - velocity.getY()) * 0.5,
                rotationVector.getZ() * 0.1 + (rotationVector.getZ() * 1.5 - velocity.getZ()) * 0.5));
    }

    public void spawnParticles(PlayerEntity player, ItemStack stack) {
        if (player.world instanceof ServerWorld serverWorld) {
            Vec3d pos = player.getPos();

            if (player.isFallFlying()) {
                ModUtils.spawnForcedParticles(serverWorld, ParticleTypes.FLAME, pos.getX(), pos.getY(), pos.getZ(), 1, 0.0, 0.0, 0.0, 0);
            } else {
                ModUtils.spawnForcedParticles(serverWorld, ParticleTypes.FLAME, pos.getX(), pos.getY(), pos.getZ(), 1, 0.0, 0.0, 0.0, 0);
            }
        }
    }

    @Override
    public long getEnergyCapacity() {
        return MAX_ENERGY;
    }

    @Override
    public long getEnergyMaxInput() {
        return 512;
    }

    @Override
    public long getEnergyMaxOutput() {
        return 256;
    }
}