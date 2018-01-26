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
public class AdditionOperationTest {

    AdditionOperation add;

    @Before
    public void setUp(){
        this.add = new AdditionOperation(1);
    }

    @After
    public void tearDown(){
    }

    @Test
    public void testAdditionOperation() {
        assertNotNull(this.add.getCurrentValue());
        assertEquals(1, this.add.getCurrentValue(), 0.01);
    }

    @Test
    public void testMake() {
        this.add.make(2);
        assertEquals(3, this.add.getCurrentValue(), 0.01);
    }

    @Test
    public void testGetValue() {
        assertNotNull(this.add.getCurrentValue());
        assertEquals(1, this.add.getCurrentValue(), 0.01);
    }
}
