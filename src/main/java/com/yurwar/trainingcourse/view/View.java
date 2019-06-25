package com.yurwar.trainingcourse.view;

import com.yurwar.trainingcourse.model.entity.Sweets;

import java.util.List;

public class View {
    public static final String MENU_GREETING = "menu.greeting";
    public static final String CHOOSE_LANGUAGE = "menu.language.choose";
    public static final String INCORRECT_INPUT = "input.incorrect";
    public static final String PRESENT_TYPE = "present.type";
    public static final String MENU = "menu";
    public static final String ENTER_LOWER_BORDER = "enter.border.lower";
    public static final String ENTER_UPPER_BORDER = "enter.border.upper";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printSweets(List<Sweets> sweets) {
        sweets.forEach(System.out::println);
        double totalWeight = sweets
                .stream()
                .mapToDouble(Sweets::getWeight)
                .sum();
        System.out.println("Total weight: " + totalWeight);
    }

}
