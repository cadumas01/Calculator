
/*Used to add two "function elements" (polynomials, exponents ...) together.
 * For addition enter "+" for the "operator" parameter; for subtraction enter "-" for the "operator" parameter */
public class Sum extends MathFunction{

    private MathFunction addend1;
    private MathFunction addend2;
    private char operator;


    public Sum(MathFunction addend1, char operator, MathFunction addend2)
    {
        this.addend1 = addend1;
        this.operator = operator; // "operator" MUST be '+' for plus; all other characters default to '-". Single quotes are required.
        this.addend2 = addend2;
    }

    public double evaluate(double x)
    {

        if(operator == '+')
        {
            return addend1.evaluate(x) + addend2.evaluate(x);
        } else
        {
            return addend1.evaluate(x) - addend2.evaluate(x);
        }

    }
}
