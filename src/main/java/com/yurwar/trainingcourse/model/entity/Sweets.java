package com.yurwar.trainingcourse.model.entity;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Weight: " + weight + "\n" +
                "Sugar content: " + sugarContent + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sweets)) return false;
        Sweets sweets = (Sweets) o;
        return Double.compare(sweets.weight, weight) == 0 &&
                Double.compare(sweets.sugarContent, sugarContent) == 0 &&
                name.equals(sweets.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, sugarContent);
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

