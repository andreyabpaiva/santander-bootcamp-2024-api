package me.dio.domain.model;

public class Account {

    private String number;
    private String agency;
    private String balance;
    private String limit;

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

    public String limit() {
        return limit;
    }

    public Account setLimit(String limit) {
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
}
