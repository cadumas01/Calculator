import java.util.Scanner;
import javax.swing.JComponent;
import java.awt.*;
import javax.swing.JFrame;

import java.awt.geom.*;


import java.awt.Rectangle;
public class CalcTest2 {

    public static void main(String[] args)
    {


        Polynomial basic = new Polynomial();
        basic.acceptValues("basic polynomial");


        System.out.println(basic.differentiate(3));

        JFrame myWindow = new JFrame();

        myWindow.setSize(640, 480);
        myWindow.setTitle("Calculation Display Testing");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);

        Rectangle rect = new Rectangle(5,10,200,100);

    }

}
