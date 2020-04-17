import java.io.FilenameFilter;
import java.util.Scanner;

public class Polynomial extends MathFunction {

     //enter the x value and the coefficients for each degree of the function. a is the fifth degree and e is the first degree

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double cons;

    private static int termsPerPolynomial = 6; //add feature to make polynomials vary in size
    private double[] polyDouble = new double[termsPerPolynomial];



   public Polynomial(double fifth, double fourth, double third, double second, double first, double constant)
    {

        a = fifth;
        b = fourth;
        c = third;
        d = second;
        e = first;
        cons = constant;

    } //this constructor allows for inputting individual values


    public Polynomial()
    {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        cons = 0;
        //these are default values for the Polynomial if these variables are not updated through acceptValues
    }

    public double evaluate(double x)
    {
        return a*x*x*x*x*x + b*x*x*x*x + c*x*x*x + d*x*x + e*x + cons;
    }


    public void acceptValues(String objectName)

        //make part of abstract class eventually - sub classes of MathFunction will have this
            /*future idea - allow for any number of terms per polynomial*/
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the degrees of the polynomial,"+ objectName + ", in the format: (5th, 4th, 3rd, 2nd, 1st, constant)." +
                " The max degree is 5; be sure to include commas for separation and exclude to parentheses.");

        //Put data input system in Polynomial class
        String polynomialString = input.next();

        String[] polynomialStringArray = polynomialString.split(",");

        for(int i = 0; i <polynomialStringArray.length ; i++)
        {
            polyDouble[i] = Double.parseDouble(polynomialStringArray[i]);
        }

        a = polyDouble[0];
        b = polyDouble[1];
        c = polyDouble[2];
        d = polyDouble[3];
        e = polyDouble[4];
        cons = polyDouble[5];

    }

    public double getA()
    {
        return a;
    }

}
