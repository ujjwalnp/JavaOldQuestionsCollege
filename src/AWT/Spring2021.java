/*
Write a program to draw pie chart using AWT.
 */

package AWT;

import java.awt.*;
import java.applet.*;

public class Spring2021 extends Applet {
    public void paint(Graphics g) {
        int width = getSize().width;
        int height = getSize().height;

        // Define data values (percentages)
        double[] data = { 30, 20, 15,    10, 25 };

        double total = 0;
        for (double value : data) {
            total += value;
        }

        double startAngle = 0;
        for (int i = 0; i < data.length; i++) {
            double arcAngle = (data[i] / total) * 360;
            g.setColor(getRandomColor());
            g.fillArc(100, 100, width - 200, height - 200, (int) startAngle, (int) arcAngle);
            startAngle += arcAngle;
        }
    }

    private Color getRandomColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        return new Color(r, g, b);
    }
}
