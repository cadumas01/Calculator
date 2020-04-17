//this is


public abstract class MathFunction {

    private double dx = 1.0/(Math.pow(2, 24));
    private double h = 1.0/(Math.pow(2,40)); //h can be smaller than dx as differentiation is less intensive than integration via riemann sums


    //!!! public abstract void acceptValues(); //make sure each sub class has this method

    public abstract double evaluate(double x);

    //this approximates the derivative at a point, x
    public double differentiate(double x)
    {
        return (evaluate(x + h) - evaluate(x))/h;
    }

    //this uses a left riemann sum approximation to evaluate a definite integral
    public double integrate(double lowerBound, double upperBound)
    {
        double sum = 0;

        while (lowerBound < upperBound - dx) {
            sum += evaluate(lowerBound) * dx;
            lowerBound += dx;
        }

        return sum;
    }



}
