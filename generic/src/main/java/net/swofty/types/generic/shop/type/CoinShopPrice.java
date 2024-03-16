package net.swofty.types.generic.shop.type;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import net.swofty.types.generic.shop.ShopPrice;
import net.swofty.types.generic.user.SkyBlockPlayer;
import net.swofty.types.generic.utility.StringUtility;

import java.util.List;

/**
 * @author <a href="https://github.com/Neruxov">Neruxov</a>
 */
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CoinShopPrice implements ShopPrice {

    int amount;

    @Override
    public List<String> getGUIDisplay() {
        return List.of("§6" + StringUtility.commaify(amount) + " Coin" + (amount != 1 ? "s" : ""));
    }

    @Override
    public String getNamePlural() {
        return "coins";
    }

    @Override
    public boolean canAfford(SkyBlockPlayer player) {
        return player.getCoins() >= amount;
    }

    @Override
    public void processPurchase(SkyBlockPlayer player) {
        player.takeCoins(amount);
    }

    @Override
    public ShopPrice multiply(int amount) {
        return new CoinShopPrice(this.amount * amount);
    }

    @Override
    public ShopPrice divide(double amount) {
        return new CoinShopPrice(Math.max((int) (this.amount / amount), 1));
    }
}
