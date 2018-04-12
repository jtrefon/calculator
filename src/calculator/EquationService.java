package calculator;

/**
 *
 * @author Jacek Trefon
 */
public class EquationService implements EquationInterface {

    private char _equation;
    private float _equated;

    /**
     * Sets equation value
     * @param equation 
     */
    public void setEquation(char equation) {
        this._equation = equation;
    }

    /**
     * Returns equation value
     * @return 
     */
    public char getEquation() {
        return this._equation;
    }

    /**
     * Sets equated (second number of the equation)
     * @param equated 
     */
    public void setEquated(float equated) {
        this._equated = equated;
    }

    /**
     * Gets equated (second value of the equation
     * @return 
     */
    public float getEquated() {
        return this._equated;
    }

    /**
     * Runs equation and returns value
     * @return 
     */
    @Override
    public float equals() {
        return 0.0F;
    }
}
