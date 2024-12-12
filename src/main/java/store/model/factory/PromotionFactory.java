package store.model.factory;

import java.time.LocalDate;
import store.model.Promotion;

public class PromotionFactory {
    public static Promotion createPromotion(String name, Integer buy, Integer get, LocalDate startDate,
                                            LocalDate endDate) {
        return new Promotion(name, buy, get, startDate, endDate);
    }
}
