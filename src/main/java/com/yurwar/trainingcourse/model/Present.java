package com.yurwar.trainingcourse.model;

import com.yurwar.trainingcourse.model.entity.Sweets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Model class that contains list of sweets objects
 */
public class Present {
    public static Comparator<Sweets> SUGAR_CONTENT_CONDITION = Comparator.comparingDouble(Sweets::getSugarContent);
    public static Comparator<Sweets> WEIGHT_CONDITION = Comparator.comparingDouble(Sweets::getWeight);

    private List<Sweets> sweets = new ArrayList<>();

    public Present(List<Sweets> sweets) {
        this.sweets = sweets;
    }

    public Present() {}

    /**
     * Sorts this list according to the order induced by the specified
     * {@link Comparator}.
     * @param comparator one of static comparators from model
     */
    public void sortByCriterion(Comparator<Sweets> comparator) {
        sweets.sort(comparator);
    }

    /**
     * @param lowerBorder lower border of sugar content range
     * @param upperBorder upper border of sugar content range
     * @return list of sweets that fits in range
     */
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
