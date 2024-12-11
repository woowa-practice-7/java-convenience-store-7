package store.model.factory;

import java.util.List;
import store.model.Promotion;
import store.model.Promotions;

public class PromotionsFactory {
    public static Promotions createPromotions(List<Promotion> promotions) {
        return new Promotions(promotions);
    }
}
