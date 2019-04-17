public class Counter {
  int myNumber = 0;
  int addNumber;
  int addOne;
  int getValue;

  public Counter() {

  }
  public int addNumber() {
    int Number = 10;
     addNumber = myNumber + Number;
    System.out.println(addNumber);
    return addNumber;
  }
  public int addOne() {
    addOne = addNumber + 1;
    System.out.println(addOne);
    return addOne;
  }
  public int getValue() {
    getValue = addOne;
    System.out.println(getValue);
    return getValue;
  }
  public void reset() {
    this.myNumber = 0;
    System.out.println(myNumber);
  }

}
