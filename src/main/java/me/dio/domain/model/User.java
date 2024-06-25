package me.dio.domain.model;

import java.util.List;

public class User {

    private String name;
    private Account account;
    private List<Feature> feature;
    private Card card;
    private List<News> news;

    public Account account() {
        return account;
    }

    public User setAccount(Account account) {
        this.account = account;
        return this;
    }

    public Card card() {
        return card;
    }

    public User setCard(Card card) {
        this.card = card;
        return this;
    }

    public List<Feature> feature() {
        return feature;
    }

    public User setFeature(List<Feature> feature) {
        this.feature = feature;
        return this;
    }

    public String name() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public List<News> news() {
        return news;
    }

    public User setNews(List<News> news) {
        this.news = news;
        return this;
    }
}
