package calculator;

/**
 *
 * @author Jacek Trefon
 */
public class CalculateFacade {

    private final EquationService _equation;

    public CalculateFacade(EquationService equation) {
        this._equation = equation;
    }

    public float equals() {
        return this._equation.equals();
    }

}
