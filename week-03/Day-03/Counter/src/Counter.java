public class Counter {
  int myNumber;
  int originalNumber;



  public Counter() {
    this.myNumber = 0;
    System.out.println(myNumber);

  }
  public Counter(int myNumber) {
    this.myNumber = myNumber;
    this.originalNumber = myNumber;
    System.out.println(myNumber);

  }
  public void add(int number) {
    this.myNumber = myNumber + number;

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
  public int reset(){
    System.out.println(originalNumber);
    return originalNumber;
  }
}
