package store.config.loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import store.model.Product;
import store.model.Products;
import store.model.Promotion;
import store.model.Promotions;
import store.model.factory.ProductFactory;


public class ProductLoader {
    private final Promotions promotions = Promotions.getInstance();

    public void loadProducts() {
        Products products = Products.getInstance();
        readProductsFromFile(products);
        products.addBaseProduct();
    }

    private void readProductsFromFile(Products products) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/products.md"))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                products.addProduct(parseProductLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Product parseProductLine(String line) {
        String[] fields = line.split(",");
        String name = fields[0].trim();
        int price = Integer.parseInt(fields[1].trim());
        int quantity = Integer.parseInt(fields[2].trim());
        String promotionName = fields[3].trim();

        Promotion promotion = promotions.findByName(promotionName);
        return ProductFactory.createProduct(name, price, quantity, promotion);
    }
}