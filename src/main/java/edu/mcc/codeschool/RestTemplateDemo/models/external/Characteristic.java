package edu.mcc.codeschool.RestTemplateDemo.models.external;

public class Characteristic {
    private String type;
    private String value;

    public String getType() {
        return type;
    }

    public Characteristic setType(String type) {
        this.type = type;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Characteristic setValue(String value) {
        this.value = value;
        return this;
    }
}
