import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {

    graphics.setColor(Color.red);
    graphics.drawLine(200, 200 ,500, 200);
    graphics.setColor(Color.BLUE);
    graphics.drawLine(200, 500, 500, 500);
    graphics.setColor(Color.BLACK);
    graphics.drawLine(200, 200, 200, 500);
    graphics.setColor(Color.YELLOW);
    graphics.drawLine(500, 200, 500, 500);

    //graphics.drawRect(200, 200, 200, 200);
    // Draw a box that has different colored lines on each edge.



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
