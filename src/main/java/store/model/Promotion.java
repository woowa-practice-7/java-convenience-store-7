package store.model;

import java.time.LocalDateTime;

public class Promotion {
    private String name;
    private Integer buy;
    private Integer get;
    private LocalDateTime start_date;
    private LocalDateTime end_date;

    public Promotion(String name, Integer buy, Integer get, LocalDateTime start_date, LocalDateTime end_date) {
        this.name = name;
        this.buy = buy;
        this.get = get;
        this.start_date = start_date;
        this.end_date = end_date;
    }
}
