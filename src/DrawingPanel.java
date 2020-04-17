import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

import java.awt.Graphics;

public class DrawingPanel extends JTextArea {


    public DrawingPanel()
    {

    }

    public void addMathFunction(MathFunction mf)
    {

    }

    /*public void paint(Graphics g)
    {
        Graphics2D graphics2 = (Graphics2D)g; //this is a graphics component??

        graphics2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Shape drawLine = new Line2D.Float(20,90,55,250);
        Shape drawArc2D = new Arc2D.Double(5,150,100,100,45,180,Arc2D.PIE);
        String textOutput = new String("These are some numbers: 5, 68");

        graphics2.setPaint(Color.BLACK);

        graphics2.draw(drawLine);
        graphics2.draw(drawArc2D);
        graphics2.drawString(basic.differentiate() , 200,200);
    }*/

}
