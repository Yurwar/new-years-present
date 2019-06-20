package com.yurwar.trainingcourse.model.entity;

import java.util.Objects;

public class Candy extends Sweets {
    private CandyProperty candyProperty;

    public Candy() {}

    public Candy(String name, double weight, double sugarContent, CandyProperty candyProperty) {
        super(name, weight, sugarContent);
        this.candyProperty = candyProperty;
    }

    @Override
    public String toString() {
        return super.toString() + "Candy Property: " + candyProperty + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candy)) return false;
        if (!super.equals(o)) return false;
        Candy candy = (Candy) o;
        return candyProperty == candy.candyProperty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), candyProperty);
    }

    public CandyProperty getCandyProperty() {
        return candyProperty;
    }

    public void setCandyProperty(CandyProperty candyProperty) {
        this.candyProperty = candyProperty;
    }
}
