package com.imie.tp.calculator.utils;

import java.util.Scanner;

/**
 * @author mickael.gaillard
 */
public final class KeyboardUtils {

  /**
   * Ask something to user with console.
   * @param displayAsk data asked.
   * @return user entry.
   */
  public static String readFromKeyboard(final String displayAsk) {
    final Scanner keyboard = new Scanner(System.in);

    System.out.println(displayAsk);

    final String returnLine = keyboard.nextLine();

    return returnLine;
  }
}
