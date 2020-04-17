import javax.swing.JFrame;
import java.awt.*;

public class CalcGraphicTest extends JFrame {

    private DrawingPanel dp;

    public CalcGraphicTest()
    {
        this.setSize(640, 480);
        this.setTitle("Calculation Display Testing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dp = new DrawingPanel();
        this.add(dp, BorderLayout.CENTER);
        this.setVisible(true);


    }

    public void drawMathFunction(MathFunction mf)
    {
        dp.addMathFunction(mf);
    }


    public static void main(String[] args)
    {
        CalcGraphicTest c = new CalcGraphicTest();
        Polynomial basic = new Polynomial();
        basic.acceptValues("basic polynomial");
        c.drawMathFunction(basic);





    }


}
