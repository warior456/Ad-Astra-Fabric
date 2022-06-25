package com.github.alexnijjar.beyond_earth.client.rei.utils;

import com.github.alexnijjar.beyond_earth.util.ModIdentifier;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class REIUtils {
    public static final Identifier ENERGY_EMPTY_TEXTURE = new ModIdentifier("textures/screens/rei/energy_bar_empty.png");
    public static final Identifier FLUID_TANK_BACK_TEXTURE = new ModIdentifier("textures/screens/rei/fluid_tank_back.png");
}