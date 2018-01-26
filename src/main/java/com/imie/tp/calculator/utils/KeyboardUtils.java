package com.imie.tp.calculator.utils;

import java.util.Scanner;

public final class KeyboardUtils {

    public static String readFromKeyboard(String displayAsk) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println(displayAsk);

        String returnLine = keyboard.nextLine();

        keyboard.close();

        return returnLine;
    }
}
