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
  private HistoryManager history = new HistoryManager();

  /**
   * Application Interface.
   * @param args application inputs.
   */
  public static void main(final String[] args) {
    final Application app = new Application();
    System.out.println("--Application::main");

    int answer = 0;
    while (answer != 9) {

      if (answer == 0) {
        System.out.println("Bienvenue !");
      }

      System.out.println("Menu : ");
      System.out.println("1: Addition");
      System.out.println("2: Soustraction");
      System.out.println("3: Multiplication");
      System.out.println("4: Division");
      System.out.println("5: History");
      System.out.println("9: Addition");

      answer = Integer.parseInt(KeyboardUtils.readFromKeyboard("Choisissez une action: "));
      System.out.println(answer);
      System.out.println("coucou");

      switch (answer) {
        case 1:
          app.addition();
          break;
        case 2:
          app.substraction();
          break;
        case 3:
          app.multiplication();
          break;
        case 4:
          app.division();
          break;
        case 5:
          app.printHistory();
          break;
        default:
          answer = 9;
          break;
      }
    }

    System.out.println("end");
  }

  /**
   * Add 2 numbers using the AdditionOperation Class.
   */
  public void addition() {
    System.out.println("--Application::Addition");

    final float firstNumber = Application.askFirstNumber();
    System.out.println("+");
    final float secondNumber = Application.askSecondNumber();

    final AdditionOperation add = new AdditionOperation(firstNumber);
    add.make(secondNumber);

    this.add2History(firstNumber, secondNumber, add.getCurrentValue(), " + ");

    System.out.println(add.getCurrentValue());
  }

  /**
   * Sub 2 numbers using the SubstractionOperation Class.
   */
  public void substraction() {
    System.out.println("--Application::Substraction");

    final float firstNumber = Application.askFirstNumber();
    System.out.println("-");
    final float secondNumber = Application.askSecondNumber();

    final SubstractionOperation sub = new SubstractionOperation(firstNumber);
    sub.make(secondNumber);

    this.add2History(firstNumber, secondNumber, sub.getCurrentValue(), " - ");

    System.out.println(sub.getCurrentValue());
  }

  /**
   * Multiply 2 numbers using the MultiplicationOperation Class.
   */
  public void multiplication() {
    System.out.println("--Application::Multiplication");

    final float firstNumber = Application.askFirstNumber();
    System.out.println("*");
    final float secondNumber = Application.askSecondNumber();

    final MultiplicationOperation mul = new MultiplicationOperation(firstNumber);
    mul.make(secondNumber);

    this.add2History(firstNumber, secondNumber, mul.getCurrentValue(), " * ");

    System.out.println(mul.getCurrentValue());
  }

  /**
   * Divide 2 numbers using the DivisionOperation Class.
   */
  public void division() {
    System.out.println("--Application::Division");

    final float firstNumber = Application.askFirstNumber();
    System.out.println("/");
    final float secondNumber = Application.askSecondNumber();

    final DivisionOperation div = new DivisionOperation(firstNumber);
    div.make(secondNumber);

    this.add2History(firstNumber, secondNumber, div.getCurrentValue(), " / ");

    System.out.println(div.getCurrentValue());
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
      final String symbol){
    System.out.println("--Application::add2History");

    this.history.addOperation(firstNumber + symbol + secondNumber + " = " + result);
  }

  /**
   * Print the history.
   */
  public void printHistory() {
    System.out.println("--Application::History");

    System.out.println(this.history.getHistory());
  }

  /**
   * Ask the first number on which operate.
   */
  public static float askFirstNumber() {
    final float firstNumber = Float.parseFloat(KeyboardUtils.readFromKeyboard("First Number :"));
    return firstNumber;
  }

  /**
   * Ask the second number on which operate.
   */
  public static float askSecondNumber() {
    final float secondNumber = Float.parseFloat(KeyboardUtils.readFromKeyboard("Second Number :"));
    return secondNumber;
  }

}
