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


}
