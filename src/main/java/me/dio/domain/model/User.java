package me.dio.domain.model;

import jakarta.persistence.*;
import java.util.List;

@Entity(name="tb_user")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(cascade=CascadeType.ALL)
    private Account account;
    @OneToOne(cascade=CascadeType.ALL)
    private Card card;

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Feature> feature;
    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
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

    public Long id() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }
}
