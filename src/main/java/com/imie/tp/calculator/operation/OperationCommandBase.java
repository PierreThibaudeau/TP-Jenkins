package com.imie.tp.calculator.operation;

/**
 *
 * @author mickael.gaillard
 */
public abstract class OperationCommandBase implements OperationCommand {

  public float currentValue;

  /**
   * Constructor for any operation.
   * @param baseValue Initial value.
   */
  public OperationCommandBase(final float baseValue) {
    this.currentValue = baseValue;
  }
}
