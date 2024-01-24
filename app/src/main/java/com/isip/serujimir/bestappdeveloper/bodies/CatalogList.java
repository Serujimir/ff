package com.isip.serujimir.bestappdeveloper.bodies;

public class CatalogList {
    private String title, days, cost;

    public CatalogList(String title, String days, String cost) {
        this.title = title;
        this.days = days;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
