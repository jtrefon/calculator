/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import calculator.DigitsService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NEX5SVZ
 */
public class DigitsClassTest {

    public DigitsClassTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addNew method, of class DigitsClass.
     */
    @Test
    public void testAddNewWithZero() {
        System.out.println("test with 0");
        DigitsService instance = new DigitsClassImpl();
        instance.addNew(1);
        instance.addNew(0);
        instance.addNew(1);
        assertEquals(instance.getCurrent(), 101, 0.0F);
    }

    /**
     * Test of addNew method, of class DigitsClass.
     */
    @Test
    public void testAddNew() {
        System.out.println("addNew & test Current");
        DigitsService instance = new DigitsClassImpl();
        instance.addNew(1);
        instance.addNew(2);
        instance.addNew(3);
        assertEquals(instance.getCurrent(), 123, 0.0F);
    }

    /**
     * Test of addNew method, of class DigitsClass.
     */
    @Test
    public void testReset() {
        System.out.println("Reset");
        DigitsService instance = new DigitsClassImpl();
        instance.addNew(1);
        instance.addNew(2);
        instance.addNew(3);
        instance.resetCurrent();
        instance.addNew(4);
        instance.addNew(5);
        instance.addNew(6);
        assertEquals(instance.getCurrent(), 456, 0.0F);
    }

    public class DigitsClassImpl extends DigitsService {
    }

}
