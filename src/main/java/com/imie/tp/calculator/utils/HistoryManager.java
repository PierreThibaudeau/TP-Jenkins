package com.imie.tp.calculator.utils;

import java.util.ArrayList;

public class HistoryManager {

  // Singleton
  private static final HistoryManager instance = new HistoryManager();

  /**
   * Constructor.
   * @return an instance of history.
   */
  public static HistoryManager getInstance() {
    return instance;
  }

  private ArrayList<String> cache = new ArrayList<String>();

  /**
   * add an operation to the list.
   * @param operation to add to the history.
   */
  public void addOperation(String operation) {
    this.cache.add(operation);
  }

  /**
   * clear the history.
   */
  public void clear() {
    this.cache.clear();
  }

  /**
   * Access to history.
   * @return history list.
   */
  public String getHistory() {
    StringBuilder stringBuilder = new StringBuilder();

    for (String string : cache) {
      stringBuilder.append(string + "\n");
    }

    return stringBuilder.toString();
  }
}
