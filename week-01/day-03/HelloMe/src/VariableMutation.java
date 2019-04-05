public class VariableMutation {
    public static void main (String [] args) {
        int a = (3);

        System.out.println (a +10);

        int b = (100);

        System.out.println (b -95);

        int c = (44);

        System.out.println (44 *2);

        int d = (125);

        System.out.println (d /5);

        int e = (8);
        double square = Math.pow(e, 3);

        System.out.println (square);

        int f1 = (123);
        int f2 = (345);
        boolean f1BiggerF2 = (f1 > f2);

        System.out.println (f1BiggerF2);

        int g1 = (350);
        int g2 = (200);
        boolean g = (g2 *2 > g1);

        System.out.println (g);

        int h = 135798745;
        boolean hBoolean = (h %11 == 0);

        System.out.println (hBoolean);

        int i1 = 10;
        int i2 = 3;
        double squareI2 = Math.pow(i2, 2);
        double cube = Math.pow(i2, 3);
        boolean i = (i1 > squareI2 && i1 < cube);

        System.out.println (i);

        int j = 1521;
        boolean dividable = (j %3 ==0 | j %5 ==0);

        System.out.println (dividable);







    }
}
