package edu.mcc.codeschool.RestTemplateDemo.models.external;

import java.util.List;

public class Attacks {
    private String name;
    private List<String> cost;
    private String damage;
    private String text;

    public String getName() {
        return name;
    }

    public Attacks setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getCost() {
        return cost;
    }

    public Attacks setCost(List<String> cost) {
        this.cost = cost;
        return this;
    }

    public String getDamage() {
        return damage;
    }

    public Attacks setDamage(String damage) {
        this.damage = damage;
        return this;
    }

    public String getText() {
        return text;
    }

    public Attacks setText(String text) {
        this.text = text;
        return this;
    }
}
