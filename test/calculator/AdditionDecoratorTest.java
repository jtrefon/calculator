package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jacek Trefon
 */
public class AdditionDecoratorTest {

    /**
     * Test of AdditionService method, of class AdditionDecorator.
     */
    @Test
    public void testAdditionService() {
        System.out.println("AdditionDecorator");
        AdditionDecorator instance = new AdditionDecorator(new DigitsServiceMock());
        instance.add();
        assertEquals(instance.equals(), 246, 0.0);
    }
    
    @Test
    public void testAdditionIncorrectService() {
        System.out.println("AdditionIncorrectDecorator");
        AdditionDecorator instance = new AdditionDecorator(new DigitsServiceMock());
        instance.add();
        assertNotEquals(instance.equals(), 245, 0.0);
    }

}
