package com.imie.tp.calculator.operation;

/**
 *
 * @author mickael.gaillard
 */
public interface OperationCommand {

  void make(float value);

  float getCurrentValue();
}
