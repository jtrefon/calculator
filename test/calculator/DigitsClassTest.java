package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NEX5SVZ
 */
public class DigitsClassTest {

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
     * Test of addNew negation method, of class DigitsClass.
     */
    @Test
    public void testAddNewNegationWithZero() {
        System.out.println("test with 0");
        DigitsService instance = new DigitsClassImpl();
        instance.addNew(1);
        instance.addNew(0);
        instance.addNew(1);
        assertNotEquals(instance.getCurrent(), 102, 0.0F);
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
     * Test of addNew Negation method, of class DigitsClass.
     */
    @Test
    public void testAddNewNegation() {
        System.out.println("addNew & test Current Negation");
        DigitsService instance = new DigitsClassImpl();
        instance.addNew(1);
        instance.addNew(2);
        instance.addNew(3);
        assertNotEquals(instance.getCurrent(), 121, 0.0F);
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

    
    /**
     * Test of addNew Reset Negation method, of class DigitsClass.
     */
    @Test
    public void testResetNegation() {
        System.out.println("Reset Negation");
        DigitsService instance = new DigitsClassImpl();
        instance.addNew(1);
        instance.addNew(2);
        instance.addNew(3);
        instance.resetCurrent();
        instance.addNew(4);
        instance.addNew(5);
        instance.addNew(6);
        assertNotEquals(instance.getCurrent(), 455, 0.0F);
    }
    
    public class DigitsClassImpl extends DigitsService {
    }

}
