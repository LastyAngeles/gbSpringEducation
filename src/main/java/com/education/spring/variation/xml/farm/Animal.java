package com.education.spring.variation.xml.farm;

public abstract class Animal {
    private String name;
    private int weight;
    private int cutieness;

    public Animal(String name, int weight, int cutieness) {
        this.name = name;
        this.weight = weight;
        this.cutieness = cutieness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCutieness() {
        return cutieness;
    }

    public void setCutieness(int cutieness) {
        this.cutieness = cutieness;
    }
}
