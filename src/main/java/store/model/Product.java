package store.model;

public class Product {
    private String name;
    private Integer price;
    private Integer quantity;
    private Promotion promotion;
    public Product(String name, Integer price, Integer quantity, Promotion promotion) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.promotion = promotion;
    }


}
