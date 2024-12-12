package store.model;

import java.util.ArrayList;
import java.util.List;
import store.model.factory.ProductFactory;

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

    public Product findBaseProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name) && product.getPromotion() == null) {
                return product;
            }
        }
        return null;
    }

    public Product findPromotionalProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name) && product.getPromotion() != null) {
                return product;
            }
        }
        return null;
    }

    public void addBaseProduct() {
        List<Product> copiedProducts = new ArrayList<>(products);
        for (Product product : copiedProducts) {
            if (product.getPromotion() != null) {
                if (findBaseProductByName(product.getName()) == null) {
                    addProduct(ProductFactory.createProduct(product.getName(), product.getPrice(), 0, null));
                }
            }
        }
    }
}
