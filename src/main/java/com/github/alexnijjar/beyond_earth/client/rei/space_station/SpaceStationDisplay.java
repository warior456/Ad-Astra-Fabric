package com.github.alexnijjar.beyond_earth.client.rei.space_station;

import java.util.List;

import com.github.alexnijjar.beyond_earth.compat.rei.REICategories;
import com.github.alexnijjar.beyond_earth.recipes.SpaceStationRecipe;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.Display;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record SpaceStationDisplay(SpaceStationRecipe recipe) implements Display {

    @Override
    public List<EntryIngredient> getInputEntries() {
        return EntryIngredients.ofIngredients(recipe.getInputs());
    }

    @Override
    public List<EntryIngredient> getOutputEntries() {
        return List.of(EntryIngredients.of(recipe.getOutput()));
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return REICategories.SPACE_STATION_CATEGORY;
    }
}