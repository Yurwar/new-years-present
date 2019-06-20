package com.yurwar.trainingcourse.controller;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    private Scanner sc;

    public ConsoleReader() {
        this.sc = new Scanner(System.in);
    }

    @Override
    public String readLine() {
        return sc.nextLine();
    }

    @Override
    public int readInt() throws NumberFormatException {
        return Integer.parseInt(sc.nextLine());
    }

    @Override
    public double readDouble() throws NumberFormatException {
        return Double.parseDouble(sc.nextLine());
    }
}
