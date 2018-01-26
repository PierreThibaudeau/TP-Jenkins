/**
 *
 */

package com.imie.tp.calculator.operation;

/**
 *
 * @author pierre.thibaudeau
 */
public class DivisionOperation extends OperationCommandBase {

  /**
   * Constructor.
   * @param baseValue initial value.
   */
  public DivisionOperation(final float baseValue) {
    super(baseValue);
  }

  /**
   * Sub parameter to initial currentValue.
   * @param number2Div number to divide.
   */
  @Override
  public void make(final float number2Div) {
    this.currentValue = number2Div == 0 ? Integer.MIN_VALUE : this.currentValue / number2Div;
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
