import java.util.ArrayList;

public class DiceSet {

ArrayList<Integer> list;


  public DiceSet() {

    this.list = new ArrayList<>();

  }
  public void listAdd(){
    list.add(0);
    list.add(0);
    list.add(0);
    list.add(0);
    list.add(0);
    list.add(0);
  }

  public void roll() {
    int max = 6;
    int min = 1;
    int range = max - min + 1;


    for (Integer one : this.list) {
      System.out.println(one);
    }

    while (list.get(0) == 6) {

    for (int i = 1; i < 7; i++) {
      int rand = (int) (Math.random() * range) + min;

      System.out.println(rand);

    }

  }
  public void getCurrent(){

      System.out.println();

  }
  public void reroll() {




      }
}


