package calculator;

/**
 *
 * @author Jacek Trefon
 */
public class CalculateFacade {

    private final EquationService _equation;

    /**
     * Constructor for Injection
     * @param equation 
     */
    public CalculateFacade(EquationService equation) {
        this._equation = equation;
    }
    
    /**
     * Returns value of current equation
     * @return 
     */
    public float equals() {
        return this._equation.equals();
    }

}
