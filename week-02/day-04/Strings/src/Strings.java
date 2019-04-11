public class Strings {

    public static void main(String[] args) {
      System.out.println(changeXY("complex"));
      System.out.println(changeXY("xxhixx"));
      System.out.println(changeXY("only"));
      System.out.println(changeXY("notx"));
    }

    public static String changeXY (String str) {
      //Base Case:
      if (str.length()==0)
        return str;

        //Recursive Case:
      else if (str.charAt(0) == ('x'))
        return 'y' + changeXY(str.substring(1));
      else
        return str.charAt(0) + changeXY(str.substring(1));
    }
}
