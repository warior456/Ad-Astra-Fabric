package com.github.alexnijjar.beyond_earth.items.armour;

import net.fabricmc.fabric.api.transfer.v1.fluid.FluidConstants;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;

public class NetheriteSpaceSuit extends SpaceSuit {

    public NetheriteSpaceSuit(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public long getTankSize() {
        return 2 * FluidConstants.BUCKET;
    }
}