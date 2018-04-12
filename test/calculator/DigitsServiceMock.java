package calculator;

/**
 *
 * @author Jacek Trefon
 */
public class DigitsServiceMock extends DigitsService implements DigitsInterface {

    /**
     * Returns mocked current value
     * @return 
     */
    @Override
    public float getCurrent() {
        return 123;
    }
}
