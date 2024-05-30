package onlineShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {

        if (this.cart.containsKey(product)) {
            this.cart.get(product).increaseQuantity();
        }
        else {
            this.cart.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int cartPrice = 0;
        for (Item item: this.cart.values()) {
            cartPrice += item.price();
        }
        return cartPrice;
    }

    public void print() {
        for (Item item: this.cart.values()) {
            System.out.println(item);
        }
    }
}
