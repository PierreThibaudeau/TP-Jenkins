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
public class SubstractionOperationTest {

    SubstractionOperation sub;

    @Before
    public void setUp(){
        this.sub = new SubstractionOperation(4);
    }

    @After
    public void tearDown(){
    }

    @Test
    public void testSubstractionOperation() {
        assertNotNull(this.sub.currentValue);
        assertEquals(4, this.sub.currentValue, 0.01);
    }

    @Test
    public void testMake() {
          this.sub.make(2);
          assertEquals(2, this.sub.currentValue, 0.01);
    }

    @Test
    public void testGetCurrentValue() {
        assertNotNull(this.sub.getCurrentValue());
        assertEquals(4, this.sub.getCurrentValue(), 0.01);
    }

    @Test
    public void testSetCurrentValue() {
        this.sub.setCurrentValue(5);
        assertNotNull(this.sub.getCurrentValue());
        assertEquals(5, this.sub.getCurrentValue(), 0.01);
    }
}
