/**
 *
 */

package com.imie.tp.calculator.operation;

/**
 *
 * @author pierre.thibaudeau
 */
public class MultiplicationOperation extends OperationCommandBase {

  public MultiplicationOperation(float baseValue) {
    super(baseValue);
  }

  /**
   * Sub parameter to initial currentValue.
   * @param number2Mul number to multiply.
   */
  @Override
  public void make(float number2Mul) {
    this.currentValue *= number2Mul;
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
