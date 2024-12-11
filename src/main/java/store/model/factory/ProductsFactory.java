package store.model.factory;

import java.util.List;
import store.model.Product;
import store.model.Products;

public class ProductsFactory {
    public static Products createProducts(List<Product> products) {
        return new Products(products);
    }
}
