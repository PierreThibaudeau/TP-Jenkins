/**
 *
 */

package com.imie.tp.calculator.operation;

/**
 *
 * @author pierre.thibaudeau
 */
public class SubstractionOperation extends OperationCommandBase {

  /**
   * Constructor.
   * @param baseValue initial value.
   */
  public SubstractionOperation(final float baseValue) {
    super(baseValue);
  }

  /**
   * Sub parameter to initial currentValue.
   * @param number2Sub number to sub.
   */
  @Override
  public void make(final float number2Sub) {
    this.currentValue -= number2Sub;
  }

  /**
   * Getter for this.currentValue.
   * @return Current value.
   */
  public float getCurrentValue() {
    return this.currentValue;
  }

  /**
   * Setter for this.currentValue.
   * @param myValue value to set.
   */
  public void setCurrentValue(final float myValue) {
    this.currentValue = myValue;
  }

}
