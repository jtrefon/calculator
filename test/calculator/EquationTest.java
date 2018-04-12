package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jacek Trefon
 */
public class EquationTest {


    /**
     * Test of getEquation method, of class Equation.
     */
    @Test
    public void testGetSetEquation() {
        EquationService instance = new EquationService();
        char expResult = '+';
        instance.setEquation(expResult);
        char result = instance.getEquation();
        assertEquals(expResult, result);
    }

    
    /**
     * Test of getEquation method, of class Equation.
     */
    @Test
    public void testGetSetEquationNegated() {
        EquationService instance = new EquationService();
        char expResult = '+';
        instance.setEquation(expResult);
        char result = instance.getEquation();
        assertNotEquals(' ', result);
    }
    
    /**
     * Test of getEquated method, of class Equation.
     */
    @Test
    public void testGetSetEquated() {
        EquationService instance = new EquationService();
        float expResult = 12.3F;
        instance.setEquated(expResult);
        float result = instance.getEquated();
        assertEquals(expResult, result, 0.0);
    }

     /**
     * Test of getEquated method, of class Equation for not equal.
     */
    @Test
    public void testGetSetNotEqualEquated() {
        EquationService instance = new EquationService();
        float expResult = 12.3F;
        instance.setEquated(expResult);
        float result = instance.getEquated();
        assertNotEquals(12.1F, result, 0.0);
    }
    
    /**
     * Test of Equals method, of class Equation.
     */
    @Test
    public void testEquals() {
        EquationService instance = new EquationService();
        float result = instance.getEquated();
        assertEquals(0.0F, result, 0.0);
    }
    
        /**
     * Test of Equals method, of class Equation.
     */
    @Test
    public void testNotEquals() {
        EquationService instance = new EquationService();
        float result = instance.getEquated();
        assertNotEquals(0.1F, result, 0.0);
    }

}
