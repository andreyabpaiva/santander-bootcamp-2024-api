package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name="tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    private String number;
    @Column(unique=true)
    private String agency;

    @Column(nullable = false, precision = 13, scale = 2)
    private String balance;
    @Column(name="addicional_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    public String agency() {
        return agency;
    }

    public Account setAgency(String agency) {
        this.agency = agency;
        return this;
    }

    public String balance() {
        return balance;
    }

    public Account setBalance(String balance) {
        this.balance = balance;
        return this;
    }

    public BigDecimal limit() {
        return limit;
    }

    public Account setLimit(BigDecimal limit) {
        this.limit = limit;
        return this;
    }

    public String number() {
        return number;
    }

    public Account setNumber(String number) {
        this.number = number;
        return this;
    }

    public Long id() {
        return id;
    }

    public Account setId(Long id) {
        this.id = id;
        return this;
    }
}
