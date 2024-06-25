package me.dio.domain.model;

public class News {

    private String iconNews;
    private String descriptionNews;

    public String descriptionNews() {
        return descriptionNews;
    }

    public News setDescriptionNews(String descriptionNews) {
        this.descriptionNews = descriptionNews;
        return this;
    }

    public String iconNews() {
        return iconNews;
    }

    public News setIconNews(String iconNews) {
        this.iconNews = iconNews;
        return this;
    }
}
