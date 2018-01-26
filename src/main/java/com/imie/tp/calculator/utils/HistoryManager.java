package com.imie.tp.calculator.utils;

import java.util.ArrayList;

/**
 * @author mickael.gaillard
 */
public class HistoryManager {

  /**
   * Singleton instance for HistoryManager
   */
  private static final HistoryManager instance = new HistoryManager();

  /**
   * ArrayList containing the operations
   */
  private final ArrayList<String> cache = new ArrayList<String>();

  /**
   * Constructor.
   * @return an instance of history.
   */
  public static HistoryManager getInstance() {
    return instance;
  }

  /**
   * add an operation to the list.
   * @param operation to add to the history.
   */
  public void addOperation(final String operation) {
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
    final StringBuilder stringBuilder = new StringBuilder();

    for (final String string : cache) {
      stringBuilder.append(string + "\n");
    }

    return stringBuilder.toString();
  }
}
