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
public class DivisionOperationTest {

    DivisionOperation div;

    @Before
    public void setUp() throws Exception {
        this.div = new DivisionOperation(4);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testDivisionOperation() {
        assertNotNull(this.div.currentValue);
        assertEquals(4, this.div.currentValue, 0.01);
    }

    @Test
    public void testMake() {
        this.div.make(2);
        assertEquals(2, this.div.currentValue, 0.01);

        this.div.make(0);
        assertEquals(Integer.MIN_VALUE, this.div.currentValue, 0.01);
    }

    @Test
    public void testGetCurrentValue() {
        assertNotNull(this.div.getCurrentValue());
        assertEquals(4, this.div.getCurrentValue(), 0.01);
    }

    @Test
    public void testSetCurrentValue() {
        this.div.setCurrentValue(5);
        assertNotNull(this.div.currentValue);
        assertEquals(5, this.div.currentValue, 0.01);
    }

}
