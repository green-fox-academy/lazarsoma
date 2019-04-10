import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.util.Random;

public class FourRectangles {

  public static void mainDraw(Graphics graphics) {
    // draw four different size and color rectangles.
    // avoid code duplication.
    int x = 20;
    int y = 30;
    int width = 10;
    int height = 10;

    paint(x, y, width, height, graphics);
    //paint(graphics);

    for (int i = 0; i < 5; i++) {
      paint(x * i, y *i, width * i, height * i, graphics);
    }
  }
    /*public static void rectangles (int x, int y, int width, int height, Graphics g) {
      g.setColor(Color.green);
      g.fillRect(x, y, width, height);
    }*/
  public static void paint(int x, int y, int width, int height, Graphics h){
    //super.paint(h);
    Random ran = new Random();
    // Assumes max and min are non-negative.
    int red = 0 + ran.nextInt(255 - 0 + 1);
    int green = 0 + ran.nextInt(255 - 0 + 1);
    int blue = 0 + ran.nextInt(255 - 0 + 1);
    int yellow = 0 + ran.nextInt(255 -0 + 1);

    Color myColor = new Color(red,green,blue,yellow);
    h.setColor(myColor);
    h.fillRect(x, y, width, height);
    h.fillRect(x, y, width, height);
    h.fillRect(x, y, width, height);
    h.fillRect(x, y, width, height);
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
