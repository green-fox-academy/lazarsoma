public class Test {
  public static void main(String[] args) {

  }

  public void drawLine(int startX, int startY, int endX, int endY) {
    if (startX > endX && startY > endY) {
      int startXCopy = startX;
      startX = endX;
      endX = startXCopy;

      int startYCopy = startY;
      startY = endY;
      endY = startYCopy;
    }

    double deltaX = endX - startX;
    double deltaY = endY - startY;
    double error = -1;
    double deltaError = Math.abs(deltaY / deltaX);

    if (deltaX == 0) {
      for (int y = startY; y < endY; y++)
        drawPixel(startX, y);
    }

    if (deltaY == 0) {
      for (int x = startX; x < endX; x++)
        drawPixel(x, startY);
    }
  }
}