package store.model;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private static final Products INSTANCE = new Products();
    private final List<Product> products = new ArrayList<>();

    private Products() {
    }

    public static Products getInstance() {
        return INSTANCE;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
