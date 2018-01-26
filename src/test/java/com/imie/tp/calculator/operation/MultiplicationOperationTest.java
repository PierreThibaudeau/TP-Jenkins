/**
 *
 */
package com.imie.tp.calculator.operation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author pierre.thibaudeau
 *
 */
public class MultiplicationOperationTest {

  MultiplicationOperation mul;

  @Before
  public void setUp() {
    this.mul = new MultiplicationOperation(4);
  }

  @After
  public void tearDown() {
  }

  @Test
  public void testMultiplicationOperation() {
    assertNotNull(this.mul.currentValue);
    assertEquals(4, this.mul.currentValue, 0.01);
  }

  @Test
  public void testMake() {
    this.mul.make(2);
    assertEquals(8, this.mul.currentValue, 0.01);
  }

  @Test
  public void testGetCurrentValue() {
    assertNotNull(this.mul.getCurrentValue());
    assertEquals(4, this.mul.getCurrentValue(), 0.01);
  }

  @Test
  public void testSetCurrentValue() {
    this.mul.setCurrentValue(5);
    assertNotNull(this.mul.getCurrentValue());
    assertEquals(5, this.mul.getCurrentValue(), 0.01);
  }
}
