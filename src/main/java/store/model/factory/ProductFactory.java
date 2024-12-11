package store.model.factory;

import store.model.Product;
import store.model.Promotion;

public class ProductFactory {
    public static Product createProduct(String name, Integer price, Integer quantity, Promotion promotion) {
        return new Product(name, price, quantity, promotion);
    }
}
