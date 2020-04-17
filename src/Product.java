/*Multiplies or divides two "MathFunction" elements together. For the operator: '*' multiplication and '/' for division
* For division: "factor1" is the dividend and "factor2" is the division */

public class Product extends MathFunction {

    MathFunction factor1;
    char operator;
    MathFunction factor2;

    public Product(MathFunction factor1, char operator, MathFunction factor2)
    {
        this.factor1 = factor1;
        this.operator = operator; //MUST use '*' for multiplication. All else is division
        this.factor2 = factor2;
    }

    public double evaluate(double x)
    {
        if(operator == '*')
            return factor1.evaluate(x) * factor2.evaluate(x);
        else
            return factor1.evaluate(x) / factor2.evaluate(x);
    }



}
