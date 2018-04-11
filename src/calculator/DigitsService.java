package calculator;

/**
 *
 * @author Jacek Trefon
 */
public class DigitsService implements DigitsInterface {

    private float _current;

    /**
     *
     * @param newDigit
     */
    public void addNew(float newDigit) {
        this._current = (this._current * 10) + newDigit;
    }

    /**
     *
     * @return float Current number
     */
    @Override
    public float getCurrent() {
        return this._current;
    }

    /**
     *
     */
    public void resetCurrent() {
        this._current = 0;
    }

}
