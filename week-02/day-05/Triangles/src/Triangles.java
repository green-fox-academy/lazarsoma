import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class Triangles {
      public static void mainDraw(Graphics graphics) {

        int a = 950;
        int b = 200;
        int c = 1200;
        int d = 600;
        int e = 700;


        graphics.drawLine(a, b, c, d);

        graphics.drawLine(a, b, e, d);

        graphics.drawLine(e, d, c, d);


      }

      // Don't touch the code below
      static int WIDTH = 1920;
      static int HEIGHT = 1080;

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



