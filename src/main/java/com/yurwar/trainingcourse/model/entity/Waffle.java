package com.yurwar.trainingcourse.model.entity;


import java.util.Objects;

public class Waffle extends Sweets {
    private boolean crunchy;

    public Waffle() {}

    public Waffle(String name, double weight, double sugarContent, boolean crunchy) {
        super(name, weight, sugarContent);
        this.crunchy = crunchy;
    }

    @Override
    public String toString() {
        return super.toString() + "Crunchy: " + crunchy + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Waffle)) return false;
        if (!super.equals(o)) return false;
        Waffle waffle = (Waffle) o;
        return crunchy == waffle.crunchy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), crunchy);
    }

    public boolean isCrunchy() {
        return crunchy;
    }

    public void setCrunchy(boolean crunchy) {
        this.crunchy = crunchy;
    }
}
