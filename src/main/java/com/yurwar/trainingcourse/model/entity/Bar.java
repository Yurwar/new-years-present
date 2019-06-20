package com.yurwar.trainingcourse.model.entity;

import java.util.Objects;

public class Bar extends Sweets {
    public BarProperty barProperty;

    public Bar() {}

    public Bar(String name, double weight, double sugarContent, BarProperty barProperty) {
        super(name, weight, sugarContent);
        this.barProperty = barProperty;
    }

    @Override
    public String toString() {
        return super.toString() + "Bar property: " + barProperty + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bar)) return false;
        if (!super.equals(o)) return false;
        Bar bar = (Bar) o;
        return barProperty == bar.barProperty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), barProperty);
    }

    public BarProperty getBarProperty() {
        return barProperty;
    }

    public void setBarProperty(BarProperty barProperty) {
        this.barProperty = barProperty;
    }
}
