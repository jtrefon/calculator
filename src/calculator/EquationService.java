package calculator;

/**
 *
 * @author Jacek Trefon
 */
public class EquationService implements EquationInterface {

    private char _equation;
    private float _equated;

    public void setEquation(char equation) {
        this._equation = equation;
    }

    public char getEquation() {
        return this._equation;
    }

    public void setEquated(float equated) {
        this._equated = equated;
    }

    public float getEquated() {
        return this._equated;
    }

    public float equals() {
        return 0.0F;
    }
}
