package me.dio.domain.model;

public class Feature {

    private String iconFeature;
    private String descriptionFeature;

    public String descriptionFeature() {
        return descriptionFeature;
    }

    public Feature setDescriptionFeature(String descriptionFeature) {
        this.descriptionFeature = descriptionFeature;
        return this;
    }

    public String iconFeature() {
        return iconFeature;
    }

    public Feature setIconFeature(String iconFeature) {
        this.iconFeature = iconFeature;
        return this;
    }
}
