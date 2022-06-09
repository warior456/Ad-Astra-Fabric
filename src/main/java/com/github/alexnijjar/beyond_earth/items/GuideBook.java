package com.github.alexnijjar.beyond_earth.items;

import com.github.alexnijjar.beyond_earth.util.ModUtils;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class GuideBook extends Item {

    public GuideBook(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (user instanceof ServerPlayerEntity player) {
            if (ModUtils.modLoaded("patchouli")) {
                // PatchouliAPI.get().openBookGUI(player, new ModIdentifier("guide_book"));
            } else {
                user.sendMessage(Text.translatable("info.beyond_earth.install_patchouli"), true);
            }
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
