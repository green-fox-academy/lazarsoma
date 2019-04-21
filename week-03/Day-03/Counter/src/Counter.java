public class Counter {
  int myNumber;



  public Counter() {
    this.myNumber = 0;
    System.out.println(myNumber);

  }
  public Counter(int myNumber) {
    this.myNumber = myNumber;
    System.out.println(myNumber);

  }
  public void addNumber(int Number) {
    this.myNumber = myNumber + Number;

    System.out.println(myNumber);
  }
  public void add(){
    this.myNumber++;
    System.out.println(myNumber);
  }
  public int get(){

    System.out.println(myNumber);
    return myNumber;
  }
  public void reset(){
    myNumber = 0;
    System.out.println(myNumber);

  }

  /*public int addMore()  {
    int Number = 10;
     addNumber = myNumber + Number;
    System.out.println(addNumber);
    return addNumber;
  }
  public int add() {
    addOne = addNumber + 1;
    System.out.println(addOne);
    return addOne;
  }
  public int get() {
    getValue = addOne;
    System.out.println(getValue);
    return getValue;
  }
  public void reset() {
    this.myNumber = 0;
    System.out.println(myNumber);
  }*/

}
