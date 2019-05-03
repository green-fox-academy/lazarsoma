public class Gnirts implements CharSequence {

  String myString;
  CharSequence charSequence;

  public Gnirts() {
    //myString = "LazarSoma";

    StringBuilder input1 = new StringBuilder();
    input1.append("LazarSoma");
    input1 = input1.reverse();
    myString = input1.toString();

    StringBuilder input2 = new StringBuilder();
    input2.append("LazarSoma");
    input2 = input2.reverse();
    charSequence = input2;
  }

  @Override
  public int length() {
    int result = myString.length();
    return result;
  }

  @Override
  public char charAt(int index) {
    char result = myString.charAt(index);
    return result;
  }

  @Override
  public CharSequence subSequence(int start, int end) {

    CharSequence result = charSequence.subSequence(2,5);

    return result;
  }
}


