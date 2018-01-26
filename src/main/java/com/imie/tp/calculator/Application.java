package com.imie.tp.calculator;

import com.imie.tp.calculator.operation.AdditionOperation;
import com.imie.tp.calculator.operation.DivisionOperation;
import com.imie.tp.calculator.operation.MultiplicationOperation;
import com.imie.tp.calculator.operation.SubstractionOperation;
import com.imie.tp.calculator.utils.HistoryManager;
import com.imie.tp.calculator.utils.KeyboardUtils;

/**
 *
 * @author pierre.thibaudeau
 * @author mickael.gaillard
 */
public class Application {

  /**
   * History Object initialization.
   */
  private final HistoryManager history = new HistoryManager();

  /**
   * Application Interface.
   * @param args application inputs.
   */
  public static void main(final String[] args) {
    final Application app = new Application();

    int answer = 0;
    while (answer != 9) {

      System.out.println("Menu : ");
      System.out.println("1: Addition");
      System.out.println("2: Soustraction");
      System.out.println("3: Multiplication");
      System.out.println("4: Division");
      System.out.println("5: History");
      System.out.println("9: Quit");
      System.out.println("\n");

      answer = Integer.parseInt(KeyboardUtils.readFromKeyboard("Choisissez une action: "));

      switch (answer) {
        case 1:
          System.out.println("Starting the addition");
          app.addition();
          break;
        case 2:
          System.out.println("Starting the substraction");
          app.substraction();
          break;
        case 3:
          System.out.println("Starting the multiplication");
          app.multiplication();
          break;
        case 4:
          System.out.println("Starting the division");
          app.division();
          break;
        case 5:
          app.printHistory();
          break;
        default:
          answer = 9;
          break;
      }
      answer = answer == 9 ? 9 : 0;
    }

    System.out.println("end");
  }

  /**
   * Add 2 numbers using the AdditionOperation Class.
   */
  public void addition() {
    final float firstNumber = Application.askFirstNumber();
    System.out.println("+");
    final float secondNumber = Application.askSecondNumber();

    final AdditionOperation add = new AdditionOperation(firstNumber);
    add.make(secondNumber);

    this.add2History(firstNumber, secondNumber, add.getCurrentValue(), " + ");
  }

  /**
   * Sub 2 numbers using the SubstractionOperation Class.
   */
  public void substraction() {
    final float firstNumber = Application.askFirstNumber();
    System.out.println("-");
    final float secondNumber = Application.askSecondNumber();

    final SubstractionOperation sub = new SubstractionOperation(firstNumber);
    sub.make(secondNumber);

    this.add2History(firstNumber, secondNumber, sub.getCurrentValue(), " - ");
  }

  /**
   * Multiply 2 numbers using the MultiplicationOperation Class.
   */
  public void multiplication() {
    final float firstNumber = Application.askFirstNumber();
    System.out.println("*");
    final float secondNumber = Application.askSecondNumber();

    final MultiplicationOperation mul = new MultiplicationOperation(firstNumber);
    mul.make(secondNumber);

    this.add2History(firstNumber, secondNumber, mul.getCurrentValue(), " * ");
  }

  /**
   * Divide 2 numbers using the DivisionOperation Class.
   */
  public void division() {
    final float firstNumber = Application.askFirstNumber();
    System.out.println("/");
    final float secondNumber = Application.askSecondNumber();

    final DivisionOperation div = new DivisionOperation(firstNumber);
    div.make(secondNumber);

    this.add2History(firstNumber, secondNumber, div.getCurrentValue(), " / ");
  }

  /**
   * Add an operation to the history.
   * @param firstNumber explicit.
   * @param secondNumber explicit.
   * @param result explicit.
   * @param symbol "+", "-", "*" or "/".
   */
  public void add2History(
      final float firstNumber,
      final float secondNumber,
      final float result,
      final String symbol) {
    System.out.println(firstNumber + symbol + secondNumber + " = " + result);
    this.history.addOperation(firstNumber + symbol + secondNumber + " = " + result);
  }

  /**
   * Print the history.
   */
  public void printHistory() {
    System.out.println(this.history.getHistory());
  }

  /**
   * Ask the first number on which operate.
   */
  public static float askFirstNumber() {
    return Float.parseFloat(KeyboardUtils.readFromKeyboard(""));
  }

  /**
   * Ask the second number on which operate.
   */
  public static float askSecondNumber() {
    return Float.parseFloat(KeyboardUtils.readFromKeyboard(""));
  }

}
