package com.yurwar.trainingcourse.controller;

import com.yurwar.trainingcourse.model.Present;
import com.yurwar.trainingcourse.model.PresentType;
import com.yurwar.trainingcourse.view.View;

import java.util.Locale;

/**
 * Class that controls user inputs, put it in the model and
 * control output results.
 * @author Yurii Matora
 */
public class PresentController {
    private Present model;
    private View view;
    private Reader reader;
    private ResourceManager UIManager;

    public PresentController(Present model, View view, Reader reader) {
        this.model = model;
        this.view = view;
        this.reader = reader;
        UIManager = ResourceManager.USER_INTERFACE;
    }

    /**
     * Main controller entry point
     */
    public void processUser() {
        view.printMessage(UIManager.getString(View.MENU_GREETING));
        chooseLanguage();
        choosePresentType();

        boolean runProgram = true;
        while (runProgram) {
            view.printMessage(UIManager.getString(View.MENU));
            int menuChoice = getIntFromReader();
            switch (menuChoice) {
                case 1: {
                    view.printSweets(model.getSweets());
                    break;
                }
                case 2: {
                    model.sortByCriterion(Present.WEIGHT_CONDITION);
                    break;
                }
                case 3: {
                    model.sortByCriterion(Present.SUGAR_CONTENT_CONDITION);
                    break;
                }
                case 4: {
                    view.printMessage(UIManager.getString(View.ENTER_LOWER_BORDER));
                    double lowerBorder = getDoubleFromReader();
                    view.printMessage(UIManager.getString(View.ENTER_UPPER_BORDER));
                    double upperBorder = getDoubleFromReader();
                    if (lowerBorder > upperBorder) {
                        view.printMessage(UIManager.getString(View.INCORRECT_INPUT));
                    }
                    view.printSweets(model.getSweetsFromSugarContentRange(lowerBorder, upperBorder));
                    break;
                }
                case 5: {
                    chooseLanguage();
                    break;
                }
                case 6: {
                    choosePresentType();
                    break;
                }
                case 7: {
                    runProgram = false;
                    break;
                }
                default: {
                    view.printMessage(UIManager.getString(View.INCORRECT_INPUT));
                }
            }
        }
    }

    /**
     * Request user for choose language
     */
    private void chooseLanguage() {
        boolean choosingLanguage = true;
        while (choosingLanguage){
            view.printMessage(UIManager.getString(View.CHOOSE_LANGUAGE));
            int languageMarker = getIntFromReader();

            switch (languageMarker) {
                case 1: {
                    UIManager.changeResource(Locale.ENGLISH);
                    choosingLanguage = false;
                    break;
                }
                case 2: {
                    UIManager.changeResource(new Locale.Builder().setLanguage("ua").build());
                    choosingLanguage = false;
                    break;
                }
                default:
                    view.printMessage(UIManager.getString(View.INCORRECT_INPUT));
            }
        }
    }

    /**
     * Request user to choose present type
     */
    private void choosePresentType() {
        boolean choosingType = true;
        while (choosingType) {
            view.printMessage(UIManager.getString(View.PRESENT_TYPE));
            int presentType = getIntFromReader();

            switch (presentType) {
                case 1: {
                    model.setSweets(PresentType.GREAT.getSweets());
                    choosingType = false;
                    break;
                }
                case 2: {
                    model.setSweets(PresentType.AVERAGE.getSweets());
                    choosingType = false;
                    break;
                }
                default: {
                    view.printMessage(UIManager.getString(View.INCORRECT_INPUT));
                }
            }

        }

    }

    /**
     * @return handled int number from user
     */
    private int getIntFromReader() {
        int result;
        while (true) {
            try {
                result = reader.readInt();
                break;
            } catch (NumberFormatException e) {
                view.printMessage(UIManager.getString(View.INCORRECT_INPUT));
            }
        }
        return result;
    }

    /**
     * @return handled double number from user
     */
    private double getDoubleFromReader() {
        double result;
        while (true) {
            try {
                result = reader.readDouble();
                break;
            } catch (NumberFormatException e) {
                view.printMessage(UIManager.getString(View.INCORRECT_INPUT));
            }
        }
        return result;
    }


}
