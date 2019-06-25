package com.yurwar.trainingcourse;


import com.yurwar.trainingcourse.controller.ConsoleReader;
import com.yurwar.trainingcourse.controller.PresentController;
import com.yurwar.trainingcourse.model.Present;
import com.yurwar.trainingcourse.view.View;

/**
 * Entry point class
 */
public class Main {
    public static void main( String[] args ) {
        PresentController controller = new PresentController(new Present(), new View(), new ConsoleReader());

        controller.processUser();
    }
}
