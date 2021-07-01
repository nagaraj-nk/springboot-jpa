package com.srjons.springbootjpa.model;

public class PersonName {
    private String name;

    public PersonName() {
        super();
    }

    public PersonName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
