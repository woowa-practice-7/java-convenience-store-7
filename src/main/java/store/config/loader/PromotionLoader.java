package store.config.loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import store.model.Promotion;
import store.model.Promotions;
import store.model.factory.PromotionFactory;

public class PromotionLoader {

    public void loadPromotions() {
        Promotions promotions = Promotions.getInstance();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/promotions.md"))) {
            parsePromotions(br, promotions);
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    private void parsePromotions(BufferedReader br, Promotions promotions) throws IOException {
        String line;
        boolean isFirstLine = true;

        while ((line = br.readLine()) != null) {
            if (isFirstLine) {
                isFirstLine = false;
                continue;
            }
            addPromotion(promotions, line);
        }
    }

    private void addPromotion(Promotions promotions, String line) {
        String[] fields = line.split(",");
        String name = fields[0].trim();
        int buy = Integer.parseInt(fields[1].trim());
        int get = Integer.parseInt(fields[2].trim());
        LocalDate startDay = LocalDate.parse(fields[3].trim());
        LocalDate endDay = LocalDate.parse(fields[4].trim());

        Promotion promotion = PromotionFactory.createPromotion(name, buy, get, startDay, endDay);
        promotions.addPromotion(promotion);
    }

    private void handleIOException(IOException e) {
        e.printStackTrace();
    }
}