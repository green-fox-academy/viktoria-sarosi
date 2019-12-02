import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyFixColorSizes {
    public static void mainDraw(Graphics graphics) {
        drawsSierpinsky(0, 0, WIDTH, 6, graphics);
    }

    private static void drawsSierpinsky(int x, int y, int size, int level, Graphics graphics) {
        if (level == 0) {
            return;
        }
        if( level == 6){
            graphics.setColor(Color.red);
        }
        if(level == 5){
            graphics.setColor(Color.blue);
        }
        if(level == 4){
            graphics.setColor(Color.orange);
        }
        if(level == 3){
            graphics.setColor(Color.green);
        }
        if(level == 2){
            graphics.setColor(Color.yellow);
        }
        if(level == 1){
            graphics.setColor(Color.green);
        }
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
