package calculator;

/**
 *
 * @author Jacek Trefon
 */
public class DigitsServiceMock extends DigitsService implements DigitsInterface {

    @Override
    public float getCurrent() {
        return 123;
    }
}
