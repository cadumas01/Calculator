//The Exponential class HAS polynomials

public class Exponential extends MathFunction{


    private static Polynomial base;
    private static Polynomial exponent;

    public Exponential(Polynomial base, Polynomial exponent)
    {
        this.base = base;
        this.exponent = exponent;

    }

    public double evaluate(double x)
    {
        return Math.pow(base.evaluate(x), exponent.evaluate(x)); //issue here with the evaluate?

    }


}
