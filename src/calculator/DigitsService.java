package calculator;

/**
 *
 * @author Jacek Trefon
 */
public class DigitsService implements DigitsInterface {

    private float _current;

    /**
     * Adds new Digit
     * @param newDigit
     */
    public void addNew(float newDigit) {
        this._current = (this._current * 10) + newDigit;
    }

    /**
     * returns "current" value
     * @return float Current number
     */
    @Override
    public float getCurrent() {
        return this._current;
    }

    /**
     * Resets current number and sets it to 0
     */
    public void resetCurrent() {
        this._current = 0;
    }

}
