package net.swofty.types.generic.item.items.vanilla.items.dyes;

import net.swofty.types.generic.item.ItemType;
import net.swofty.types.generic.item.SkyBlockItem;
import net.swofty.types.generic.item.impl.CustomSkyBlockItem;
import net.swofty.types.generic.item.impl.MultiDefaultCraftable;
import net.swofty.types.generic.item.impl.SkyBlockRecipe;
import net.swofty.types.generic.item.impl.recipes.ShapelessRecipe;
import net.swofty.types.generic.user.statistics.ItemStatistics;

import java.util.ArrayList;
import java.util.List;

public class LightGrayDye implements CustomSkyBlockItem, MultiDefaultCraftable {
    @Override
    public List<SkyBlockRecipe<?>> getRecipes() {
        List<SkyBlockRecipe<?>> recipes = new ArrayList<>();

        recipes.add(new ShapelessRecipe(SkyBlockRecipe.RecipeType.NONE,
                new SkyBlockItem(ItemType.LIGHT_GRAY_DYE), 1)
                .add(ItemType.AZURE_BLUET, 1));

        recipes.add(new ShapelessRecipe(SkyBlockRecipe.RecipeType.NONE,
                new SkyBlockItem(ItemType.LIGHT_GRAY_DYE), 1)
                .add(ItemType.OXEYE_DAISY, 1));

        recipes.add(new ShapelessRecipe(SkyBlockRecipe.RecipeType.NONE,
                new SkyBlockItem(ItemType.LIGHT_GRAY_DYE), 1)
                .add(ItemType.WHITE_TULIP, 1));

        recipes.add(new ShapelessRecipe(SkyBlockRecipe.RecipeType.NONE,
                new SkyBlockItem(ItemType.LIGHT_GRAY_DYE), 2)
                .add(ItemType.GRAY_DYE, 1)
                .add(ItemType.WHITE_DYE, 1));

        return recipes;
    }

    @Override
    public ItemStatistics getStatistics(SkyBlockItem instance) {
        return ItemStatistics.empty();
    }
}
