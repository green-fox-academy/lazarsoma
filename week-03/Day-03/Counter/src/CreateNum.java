public class CreateNum {
  public static void main(String[] args) {
    Counter co1 = new Counter(2);
    co1.add(7);
    co1.add();
    co1.get();
    co1.reset();

    Counter co2 = new Counter();
    co2.add(4);
    co2.add();
    co2.reset();
    co2.add(10);
    co2.get();
    co2.reset();
  }
}
