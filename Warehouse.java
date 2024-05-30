package onlineShop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;



    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public Map<String, Integer> getPrices() {
        return this.prices;
    }

    public Map<String, Integer> getStocks() {
        return this.stocks;
    }

    public boolean has(String product) {
        return this.prices.containsKey(product);
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        if (prices.containsKey(product)) {
            return prices.get(product);
        }
        else {
            return -99;
        }
    }

    public int stock(String product) {
        if (prices.containsKey(product)) {
            return stocks.get(product);
        }
        else {
            return 0;
        }
    }


    public boolean take(String product) {
        if (stocks.containsKey(product) && stocks.get(product) > 0 ) {
            stocks.put(product, stocks.get(product) - 1);
            return true;
        }
        else {
            return false;
        }
    }

    public Set<String> products() {
        return prices.keySet();
    }

}

