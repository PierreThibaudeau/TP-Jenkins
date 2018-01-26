package com.imie.tp.calculator.operation;

public abstract class OperationCommandBase implements OperationCommand {

  public float currentValue;

  public OperationCommandBase(float baseValue)
  {
      this.currentValue = baseValue;
  }
}
