package com.yurwar.trainingcourse.model;

import com.yurwar.trainingcourse.model.entity.Sweets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Present {
    public static Comparator<Sweets> SUGAR_CONTENT_CONDITION = Comparator.comparingDouble(Sweets::getSugarContent);
    public static Comparator<Sweets> WEIGHT_CONDITION = Comparator.comparingDouble(Sweets::getWeight);

    private List<Sweets> sweets = new ArrayList<>();

    public Present(List<Sweets> sweets) {
        this.sweets = sweets;
    }

    public void sortByCriterion(Comparator<Sweets> comparator) {
        sweets.sort(comparator);
    }

    public List<Sweets> getSweetsFromSugarContentRange(double lowerBorder, double upperBorder) {
        List<Sweets> sweetsInRange = new ArrayList<>();

        for (Sweets sweet : sweets) {
            if (sweet.getSugarContent() >= lowerBorder && sweet.getSugarContent() <= upperBorder) {
                sweetsInRange.add(sweet);
            }
        }

        return sweetsInRange;
    }

    public List<Sweets> getSweets() {
        return sweets;
    }

    public void setSweets(List<Sweets> sweets) {
        this.sweets = sweets;
    }
}
