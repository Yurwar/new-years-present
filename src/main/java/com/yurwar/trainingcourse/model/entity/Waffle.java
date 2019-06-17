package com.yurwar.trainingcourse.model.entity;


public class Waffle extends Sweets {
    private boolean crunchy;

    public Waffle() {}

    public Waffle(String name, double weight, double sugarContent, boolean crunchy) {
        super(name, weight, sugarContent);
        this.crunchy = crunchy;
    }

    public boolean isCrunchy() {
        return crunchy;
    }

    public void setCrunchy(boolean crunchy) {
        this.crunchy = crunchy;
    }
}
