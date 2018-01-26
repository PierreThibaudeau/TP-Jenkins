package com.imie.tp.calculator.utils;

import java.util.Scanner;

public final class KeyboardUtils {

  /**
   * Ask something to user with console.
   * @param displayAsk data asked.
   * @return user entry.
   */
  public static String readFromKeyboard(String displayAsk) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println(displayAsk);

    String returnLine = keyboard.nextLine();

    return returnLine;
  }
}
