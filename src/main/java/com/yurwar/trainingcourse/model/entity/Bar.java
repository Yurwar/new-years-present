package com.yurwar.trainingcourse.model.entity;

public class Bar extends Sweets {
    public BarProperty barProperty;

    public Bar() {}

    public Bar(String name, double weight, double sugarContent, BarProperty barProperty) {
        super(name, weight, sugarContent);
        this.barProperty = barProperty;
    }

    public BarProperty getBarProperty() {
        return barProperty;
    }

    public void setBarProperty(BarProperty barProperty) {
        this.barProperty = barProperty;
    }
}
