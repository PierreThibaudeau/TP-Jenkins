package com.imie.tp.calculator;

import com.imie.tp.calculator.operation.AdditionOperation;
import com.imie.tp.calculator.operation.DivisionOperation;
import com.imie.tp.calculator.operation.MultiplicationOperation;
import com.imie.tp.calculator.operation.SubstractionOperation;
import com.imie.tp.calculator.utils.HistoryManager;
import com.imie.tp.calculator.utils.KeyboardUtils;

public class Application {

    HistoryManager history = new HistoryManager();

    public static void main(String[] args) {
        Application App = new Application();
        System.out.println("--Application::main");

        int answer = 0;
        while(answer != 9) {

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
                    App.Addition();
                    break;
                case 2:
                    App.Substraction();
                    break;
                case 3:
                    App.Multiplication();
                    break;
                case 4:
                    App.Division();
                    break;
                case 5:
                    App.History();
                    break;
                default:
                    answer = 9;
                    break;
            }
        }

        System.out.println("end");

        // If enter 5
        // Display last calculate :
        //    1 + 1 = 2
        //    2 * 3 = 6
    }

    public void Addition() {
        System.out.println("--Application::Addition");
        float firstNumber = Float.parseFloat(KeyboardUtils.readFromKeyboard("First Number :"));
        System.out.println("+");
        float secondNumber = Float.parseFloat(KeyboardUtils.readFromKeyboard("Second Number :"));

        AdditionOperation add = new AdditionOperation(firstNumber);
        add.make(secondNumber);

        this.addOperation(firstNumber, secondNumber, add.getCurrentValue(), " + ");

        System.out.println(add.getCurrentValue());
    }

    public void Substraction() {
        System.out.println("--Application::Substraction");
        float firstNumber = Float.parseFloat(KeyboardUtils.readFromKeyboard("First Number :"));
        System.out.println("-");
        float secondNumber = Float.parseFloat(KeyboardUtils.readFromKeyboard("Second Number :"));

        SubstractionOperation sub = new SubstractionOperation(firstNumber);
        sub.make(secondNumber);

        this.addOperation(firstNumber, secondNumber, sub.getCurrentValue(), " - ");

        System.out.println(sub.getCurrentValue());
    }

    public void Multiplication() {
        System.out.println("--Application::Multiplication");

        float firstNumber = Float.parseFloat(KeyboardUtils.readFromKeyboard("First Number :"));
        System.out.println("*");
        float secondNumber = Float.parseFloat(KeyboardUtils.readFromKeyboard("Second Number :"));

        MultiplicationOperation mul = new MultiplicationOperation(firstNumber);
        mul.make(secondNumber);

        this.addOperation(firstNumber, secondNumber, mul.getCurrentValue(), " * ");

        System.out.println(mul.getCurrentValue());
    }

    public void Division() {
        System.out.println("--Application::Division");

        float firstNumber = Float.parseFloat(KeyboardUtils.readFromKeyboard("First Number :"));
        System.out.println("/");
        float secondNumber = Float.parseFloat(KeyboardUtils.readFromKeyboard("Second Number :"));

        DivisionOperation div = new DivisionOperation(firstNumber);
        div.make(secondNumber);

        this.addOperation(firstNumber, secondNumber, div.getCurrentValue(), " / ");

        System.out.println(div.getCurrentValue());
    }

    public void addOperation(float firstNumber, float secondNumber, float result, String symbol) {
        this.history.addOperation(firstNumber + symbol + secondNumber + " = " + result);
    }

    public void History() {
        System.out.println("--Application::History");

        System.out.println(this.history.getHistory());
    }
}
