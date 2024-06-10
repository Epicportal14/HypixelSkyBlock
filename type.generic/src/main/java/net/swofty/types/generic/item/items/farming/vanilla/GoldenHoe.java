package net.swofty.types.generic.item.items.farming.vanilla;

import net.swofty.types.generic.item.ItemTypeLinker;
import net.swofty.types.generic.item.MaterialQuantifiable;
import net.swofty.types.generic.item.SkyBlockItem;
import net.swofty.types.generic.item.impl.*;
import net.swofty.types.generic.item.impl.recipes.ShapedRecipe;
import net.swofty.commons.statistics.ItemStatistics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.swofty.commons.item.ItemType;

public class GoldenHoe implements CustomSkyBlockItem, StandardItem, DefaultCraftable, Sellable {

    @Override
    public ItemStatistics getStatistics(SkyBlockItem instance) {
        return ItemStatistics.empty();
    }

    @Override
    public SkyBlockRecipe<?> getRecipe() {
        Map<Character, MaterialQuantifiable> ingredientMap = new HashMap<>();
        ingredientMap.put('A', new MaterialQuantifiable(ItemTypeLinker.GOLD_INGOT, 1));
        ingredientMap.put('B', new MaterialQuantifiable(ItemTypeLinker.STICK, 1));
        ingredientMap.put(' ', new MaterialQuantifiable(ItemType.AIR, 1));
        List<String> pattern = List.of(
                "AA",
                " B",
                " B");

        return new ShapedRecipe(SkyBlockRecipe.RecipeType.NONE, new SkyBlockItem(ItemTypeLinker.GOLDEN_HOE), ingredientMap, pattern);
    }

    @Override
    public double getSellValue() {
        return 4;
    }

    @Override
    public StandardItemType getStandardItemType() {
        return StandardItemType.HOE;
    }
}
