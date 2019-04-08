public class Cuboid {
  public static void main(String[] args) {
    double width = 81.2;
    double height = 1.78;
    double length = 4.35;

    double surface = 2 * length * width + 2 * width * height + 2 * length * height;


    {System.out.println("Volume = " + width * height * length);
    }
    {System.out.println("Surface = " + surface);
    }
  }
}

