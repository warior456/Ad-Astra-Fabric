package net.mrscauthd.beyond_earth.recipes;

import java.util.LinkedList;
import java.util.List;

import com.google.gson.JsonObject;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.mrscauthd.beyond_earth.registry.ModRecipes;

public class SpaceStationRecipe extends ModRecipe {

    public SpaceStationRecipe(Identifier id, Ingredient[] inputs, List<Integer> stackCounts) {
        super(id, inputs, stackCounts);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.SPACE_STATION_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.SPACE_STATION_RECIPE;
    }

    public static class Serializer implements RecipeSerializer<SpaceStationRecipe> {

        @Override
        public SpaceStationRecipe read(Identifier id, JsonObject json) {

            List<Ingredient> ingredients = new LinkedList<>();
            List<Integer> stackCounts = new LinkedList<>();
            json.getAsJsonArray("ingredients").forEach(element -> {
                JsonObject jsonObject = element.getAsJsonObject();
                ingredients.add(Ingredient.fromJson(jsonObject.get("ingredient").getAsJsonObject()));
                stackCounts.add(jsonObject.get("count").getAsInt());
            });

            return new SpaceStationRecipe(id, ingredients.toArray(new Ingredient[0]), stackCounts);
        }

        @Override
        public SpaceStationRecipe read(Identifier id, PacketByteBuf buf) {

            List<Ingredient> ingredients = buf.readList(buf2 -> {
                return Ingredient.fromPacket(buf2);
            });
            List<Integer> stackCounts = buf.readList(buf2 -> {
                return buf2.readInt();
            });

            return new SpaceStationRecipe(id, ingredients.toArray(new Ingredient[0]), stackCounts);
        }

        @Override
        public void write(PacketByteBuf buf, SpaceStationRecipe recipe) {
            buf.writeCollection(recipe.getIngredients(), (buf2, ingredient) -> {
                ingredient.write(buf2);
            });
            buf.writeCollection(recipe.getStackCounts(), (buf2, count) -> {
                buf2.writeInt(count);
            });
        }
    }
}