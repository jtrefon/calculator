/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        System.out.println("get/setEquation");
        EquationService instance = new EquationService();
        char expResult = '+';
        instance.setEquation(expResult);
        char result = instance.getEquation();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEquated method, of class Equation.
     */
    @Test
    public void testGetSetEquated() {
        System.out.println("get/setEquated");
        EquationService instance = new EquationService();
        float expResult = 12.3F;
        instance.setEquated(expResult);
        float result = instance.getEquated();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of Equals method, of class Equation.
     */
    @Test
    public void testEquals() {
        System.out.println("Equals");
        EquationService instance = new EquationService();
        float result = instance.getEquated();
        assertEquals(0.0F, result, 0.0);
    }

}
