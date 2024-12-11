package store.model.factory;

import java.time.LocalDateTime;
import store.model.Promotion;

public class PromotionFactory {
    public static Promotion createPromotion(String name, Integer buy, Integer get, LocalDateTime start_date,
                                            LocalDateTime end_date) {
        return new Promotion(name, buy, get, start_date, end_date);
    }
}
