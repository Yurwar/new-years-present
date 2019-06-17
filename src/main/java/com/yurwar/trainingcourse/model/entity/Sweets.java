package com.yurwar.trainingcourse.model.entity;

public abstract class Sweets {
    private String name;
    private double weight;
    private double sugarContent;

    public Sweets() {}

    public Sweets(String name, double weight, double sugarContent) {
        this.name = name;
        this.weight = weight;
        this.sugarContent = sugarContent;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(double sugarContent) {
        this.sugarContent = sugarContent;
    }
}

