package me.dio.domain.model;

public abstract class AbstractResource {

    private Long id;
    private String icon;
    private String description;

    public String description() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String icon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;

    }

    public Long id() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
