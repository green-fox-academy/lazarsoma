
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

  public class MiddleLines {
    public static void mainDraw(Graphics graphics) {

      graphics.setColor(Color.red);
      graphics.drawLine(0, 500, 2000, 500);

      graphics.setColor(Color.green);
      graphics.drawLine(950, 0, 950, 2000);

      // draw a red horizontal line to the canvas' middle.
      // draw a green vertical line to the canvas' middle.


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
