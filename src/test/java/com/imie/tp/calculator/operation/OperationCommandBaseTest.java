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
public class OperationCommandBaseTest {

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {

  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testOperationCommandBase() {
    AdditionOperation add = new AdditionOperation(5);
    assertNotNull(add.currentValue);
    assertEquals(5, add.currentValue, 0.01);
  }
}
