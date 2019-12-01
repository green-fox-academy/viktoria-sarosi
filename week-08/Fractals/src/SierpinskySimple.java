import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskySimple {
    public static void mainDraw(Graphics graphics) {
        drawsSierpinsky(0, 0, WIDTH, 6, graphics);
    }

    private static void drawsSierpinsky(int x, int y, int size, int level, Graphics graphics) {
        if (level == 0) {
            return;
        }
        graphics.setColor(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
        graphics.fillRect(x + size / 3, y + size / 3, size / 3, size / 3);
        drawsSierpinsky(x, y, size / 3, level - 1, graphics);
        drawsSierpinsky(x + size / 3, y, size / 3, level - 1, graphics);
        drawsSierpinsky(x + size / 3 * 2, y, size / 3, level - 1, graphics);
        drawsSierpinsky(x, y + size / 3, size / 3, level - 1, graphics);
        drawsSierpinsky(x + size / 3 * 2, y + size / 3, size / 3, level - 1, graphics);
        drawsSierpinsky(x, y + size / 3 * 2, size / 3, level - 1, graphics);
        drawsSierpinsky(x + size / 3, y + size / 3 * 2, size / 3, level - 1, graphics);
        drawsSierpinsky(x + size / 3 * 2, y + size / 3 * 2, size / 3, level - 1, graphics);
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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
