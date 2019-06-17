package com.yurwar.trainingcourse.model.entity;

public class Candy extends Sweets {
    private CandyProperty candyProperty;

    public Candy() {}

    public Candy(String name, double weight, double sugarContent, CandyProperty candyProperty) {
        super(name, weight, sugarContent);
        this.candyProperty = candyProperty;
    }

    public CandyProperty getCandyProperty() {
        return candyProperty;
    }

    public void setCandyProperty(CandyProperty candyProperty) {
        this.candyProperty = candyProperty;
    }
}
