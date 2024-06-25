package me.dio.domain.model;

import jakarta.persistence.*;


@Entity(name="tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true, nullable=false)
    private String number;

    @Column(name="avaliable_limit",precision=13, scale=12)
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

    public Long id() {
        return id;
    }

    public Card setId(Long id) {
        this.id = id;
        return this;
    }
}
