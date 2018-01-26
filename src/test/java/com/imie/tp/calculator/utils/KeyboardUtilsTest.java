/**
 *
 */
package com.imie.tp.calculator.utils;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author pierre.thibaudeau
 *
 */
public class KeyboardUtilsTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testReadFromKeyboard() {

    ByteArrayInputStream in = new ByteArrayInputStream("My string".getBytes());
    System.setIn(in);

    assertEquals("My string", KeyboardUtils.readFromKeyboard(""));
  }

}
