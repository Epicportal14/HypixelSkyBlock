package net.swofty.types.generic.item.items.enchanted;


import net.swofty.types.generic.item.ItemType;
import net.swofty.types.generic.item.impl.Enchanted;
import net.swofty.types.generic.item.impl.Sellable;
import net.swofty.types.generic.item.impl.SkyBlockRecipe;

public class EnchantedNetherWart implements Enchanted, Sellable {
    @Override
    public ItemType getCraftingMaterial() {
        return ItemType.NETHER_WART;
    }

    @Override
    public SkyBlockRecipe.RecipeType getRecipeType() {
        return SkyBlockRecipe.RecipeType.FARMING;
    }

    @Override
    public double getSellValue() {
        return 640;
    }
}