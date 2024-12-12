package store.model;

import java.util.ArrayList;
import java.util.List;

public class Promotions {
    private static Promotions INSTANCE = new Promotions();
    private final List<Promotion> promotions = new ArrayList<>();

    private Promotions() {
    }

    public static Promotions getInstance() {
        return INSTANCE;
    }

    public void addPromotion(Promotion promotion) {
        promotions.add(promotion);
    }

    public Promotion findByName(String name) {
        for (Promotion promotion : promotions) {
            if (promotion.getName().equals(name)) {
                return promotion;
            }
        }
        return null;
    }


}
