package edu.mcc.codeschool.RestTemplateDemo.models;

import java.util.List;
import java.util.UUID;

public class Card {
    private UUID id;
    private String externalId;
    private String cardName;
    private Double averagePrice;
    private String hp;
    private String bestInstructor;
    private List<String> types;

    public UUID getId() {
        return id;
    }

    public Card setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public Card setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getCardName() {
        return cardName;
    }

    public Card setCardName(String cardName) {
        this.cardName = cardName;
        return this;
    }

    public Double getAveragePrice() {
        return averagePrice;
    }

    public Card setAveragePrice(Double averagePrice) {
        this.averagePrice = averagePrice;
        return this;
    }

    public String getHp() {
        return hp;
    }

    public Card setHp(String hp) {
        this.hp = hp;
        return this;
    }

    public String getBestInstructor() {
        return bestInstructor;
    }

    public Card setBestInstructor(String bestInstructor) {
        this.bestInstructor = bestInstructor;
        return this;
    }

    public List<String> getTypes() {
        return types;
    }

    public Card setTypes(List<String> types) {
        this.types = types;
        return this;
    }
}
