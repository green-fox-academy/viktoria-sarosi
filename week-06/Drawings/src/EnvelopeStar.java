import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics){
        graphics.drawLine(0,HEIGHT/2,WIDTH, HEIGHT/2);
        graphics.drawLine(WIDTH/2,0, WIDTH/2, HEIGHT);

        for (int i = 0; i < 12; i++) {
            graphics.drawLine(HEIGHT/2, 0 + i * 25,HEIGHT/2 + i *25, WIDTH/2);
        }
        for (int i = 0; i < 12; i++) {
            graphics.drawLine(HEIGHT/2, 0 + i * 25,HEIGHT/2 - i * 25, WIDTH/2);
        }
        for (int i = 0; i < 12; i++) {
            graphics.drawLine(HEIGHT/2 + i * 25, WIDTH/2, HEIGHT/2, WIDTH - i * 25);
        }
        for (int i = 0; i < 12; i++) {
            graphics.drawLine(HEIGHT/2 - i * 25, WIDTH/2, HEIGHT/2, WIDTH - i * 25);
        }
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
