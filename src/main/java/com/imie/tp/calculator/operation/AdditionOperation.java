package com.imie.tp.calculator.operation;

public class AdditionOperation extends OperationCommandBase {

  /**
   * Constructor
   * @param baseValue initial value.
   */
  public AdditionOperation(float baseValue) {
    super(baseValue);
  }

  /**
   * Add parameter to initial currentValue.
   *
   * @param number2Add number to add.
   */
  @Override
  public void make(float number2Add) {
    this.currentValue += number2Add;
  }

  /**
   * Getter for this.currentValue.
   *
   * @return Current value.
   */
  public float getCurrentValue() {
    return this.currentValue;
  }

  /**
   * Setter for this.currentValue.
   *
   * @param myValue value to set.
   */
  public void setCurrentValue(final float myValue) {
    this.currentValue = myValue;
  }

}
