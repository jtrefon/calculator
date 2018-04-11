package calculator;

/**
 *
 * @author Jacek Trefon
 */
public class AdditionDecorator extends EquationService {

    private final DigitsService _digitsService;

    AdditionDecorator(DigitsService digitsService) {
        this._digitsService = digitsService;
    }

    /**
     * moves current to equated releasing current for new number 
     */
    public void add() {
        this.setEquation('+');
        this.setEquated(this._digitsService.getCurrent());
        this._digitsService.resetCurrent();
    }

    /**
     * Overrides Equation with number addition
     * @return float results of Addition
     */
    @Override
    public float equals() {
        return this.getEquated() + this._digitsService.getCurrent();
    }
}
