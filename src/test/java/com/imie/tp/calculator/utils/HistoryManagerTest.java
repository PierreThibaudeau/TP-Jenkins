/**
 *
 */
package com.imie.tp.calculator.utils;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author pierre.thibaudeau
 *
 */
public class HistoryManagerTest {

    HistoryManager history = new HistoryManager();

    @Before
    public void setUp() throws Exception {
        history.addOperation("1 + 1 = 2");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testclear() {
        history.clear();
        assertNotEquals("1 + 1 = 2", history.getHistory());
    }

    @Test
    public void testAddOperation() {
        assertTrue(true);
    }

    @Test
    public void testGetHistory() {
        assertNotEquals("1 + 1 = 2", history.getHistory());
    }

}
