public class Station {
  int gasAmount;

  public Station(){
    this.gasAmount = 50000;
  }

  public void refill (Car car){
    this.gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
    System.out.println(gasAmount);
    System.out.println(car.gasAmount);
  }
}
