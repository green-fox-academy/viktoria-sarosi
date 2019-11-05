import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ReallyRainbowBoxFunction{
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        // rainbowBoxes;
        for (int i = 0; i < 6; i++) {
            int a = 320 - i * 60;
            Color color = Color.yellow;
            if (i == 0) {
                color = Color.red;
            }
            else if (i == 1) {
                color = Color.orange;
            }
            else if (i == 2) {
                color = Color.yellow;
            }
            else if (i == 3) {
                color = Color.green;
            }
            else if (i == 4) {
                color = Color.blue;
            }
            else if (i == 5) {
                color = Color.magenta;
            }
            rainbowBoxes(a, color, graphics);
        }
    }
    private static void rainbowBoxes(int size, Color color, Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(WIDTH/2-size/2,HEIGHT/2-size/2, size,size);
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

