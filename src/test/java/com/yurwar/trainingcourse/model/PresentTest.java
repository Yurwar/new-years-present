package com.yurwar.trainingcourse.model;

import com.yurwar.trainingcourse.model.entity.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PresentTest {
    private Present present;

    @Before
    public void initPresent() {
        present = new Present();
        List<Sweets> sweets = new ArrayList<Sweets>();
        sweets.add(new Candy("Herbina", 0.12, 3.0, CandyProperty.NORMAL));
        sweets.add(new Candy("Caramelle", 0.07, 5.4, CandyProperty.ORGANIC));
        sweets.add(new Waffle("Nesquick", 0.4, 6.1, true));
        sweets.add(new Bar("AXA", 0.01, 0.5, BarProperty.MUESLI));
        present.setSweets(sweets);
    }


    @Test
    public void sortByWeight() {
        List<Sweets> expected = new ArrayList<>();
        expected.add(new Bar("AXA", 0.01, 0.5, BarProperty.MUESLI));
        expected.add(new Candy("Caramelle", 0.07, 5.4, CandyProperty.ORGANIC));
        expected.add(new Candy("Herbina", 0.12, 3.0, CandyProperty.NORMAL));
        expected.add(new Waffle("Nesquick", 0.4, 6.1, true));

        present.sortByCriterion(Present.WEIGHT_CONDITION);
        assertArrayEquals(expected.toArray(), present.getSweets().toArray());
    }

    @Test
    public void sortBySugarContent() {
        List<Sweets> expected = new ArrayList<>();
        expected.add(new Bar("AXA", 0.01, 0.5, BarProperty.MUESLI));
        expected.add(new Candy("Herbina", 0.12, 3.0, CandyProperty.NORMAL));
        expected.add(new Candy("Caramelle", 0.07, 5.4, CandyProperty.ORGANIC));
        expected.add(new Waffle("Nesquick", 0.4, 6.1, true));

        present.sortByCriterion(Present.SUGAR_CONTENT_CONDITION);
        assertArrayEquals(expected.toArray(), present.getSweets().toArray());

    }

    @Test
    public void getSweetsFromSugarContentRange() {
        List<Sweets> expected = new ArrayList<>();
        expected.add(new Candy("Caramelle", 0.07, 5.4, CandyProperty.ORGANIC));
        expected.add(new Waffle("Nesquick", 0.4, 6.1, true));

        List<Sweets> actual = present.getSweetsFromSugarContentRange(5.0, 6.5);
        assertArrayEquals(expected.toArray(), actual.toArray());

    }
}