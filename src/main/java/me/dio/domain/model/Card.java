package me.dio.domain.model;

public class Card {

    private String number;
    private String limit;

    public String limit() {
        return limit;
    }

    public Card setLimit(String limit) {
        this.limit = limit;
        return this;
    }

    public String number() {
        return number;
    }

    public Card setNumber(String number) {
        this.number = number;
        return this;
    }
}
