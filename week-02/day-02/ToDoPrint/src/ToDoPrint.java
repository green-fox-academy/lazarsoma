public class ToDoPrint {
  public static void main(String... args){
      String todoText = " - Buy milk\n";
      StringBuilder sb = new StringBuilder("- Buy milk\n");
      sb.append("- Download games\n \t - Diablo");
      sb.insert(0, "My todo:\n");
      System.out.println(sb);
  }
}

