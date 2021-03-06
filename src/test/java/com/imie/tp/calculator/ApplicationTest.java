/**
 *
 */
package com.imie.tp.calculator;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.imie.tp.calculator.utils.HistoryManager;
import com.imie.tp.calculator.utils.KeyboardUtils;

/**
 * @author pierre.thibaudeau
 *
 */
public class ApplicationTest {

  HistoryManager history = new HistoryManager();

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
  public void testMain() {
    assertTrue(true);
  }

  @Test
  public void testAdd2History() {
    assertTrue(true);
  }

  @Test
  public void testHistory() {
    assertTrue(true);
  }

  @Test
  public void testAddition() {
    assertTrue(true);
  }

  @Test
  public void testSubstraction() {
    assertTrue(true);
  }

  @Test
  public void testDivision() {
    assertTrue(true);
  }

  @Test
  public void testMultiplication() {
    assertTrue(true);
  }

  @Test
  public void testAskFirstNumber() {
    ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
    System.setIn(in);

    assertEquals(2, (int)Application.askFirstNumber());
  }

  @Test
  public void testAskSecondNumber() {
    ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
    System.setIn(in);

    assertEquals(2, (int)Application.askSecondNumber());
  }

}
