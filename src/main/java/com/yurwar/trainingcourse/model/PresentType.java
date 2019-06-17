package com.yurwar.trainingcourse.model;

import com.yurwar.trainingcourse.model.entity.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum PresentType {
    GREAT(new Candy("Herbina", 0.04, 3.0, CandyProperty.NORMAL),
            new Candy("Iris", 0.04, 2.0, CandyProperty.GLUTEN_FREE),
            new Candy("Caramelle", 0.07, 5.4, CandyProperty.ORGANIC),
            new Waffle("Nesquick", 0.1, 6.1, true),
            new Bar("AXA", 0.12, 0.5, BarProperty.MUESLI)),
    AVERAGE(new Candy("Eclair", 0.02, 4.2, CandyProperty.ORGANIC),
            new Waffle("Roshetto", 0.09, 3.7, false),
            new Bar("Schluckwerder", 0.31, 12, BarProperty.MARZIPAN));

    private List<Sweets> sweets = new ArrayList<>();

    private PresentType(Sweets... sweets) {
        this.sweets.addAll(Arrays.asList(sweets));
    }

    public List<Sweets> getSweets() {
        return sweets;
    }
}
