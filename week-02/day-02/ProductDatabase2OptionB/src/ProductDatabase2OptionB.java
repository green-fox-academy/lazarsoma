import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProductDatabase2OptionB {
  public static void main(String[] args) {
    HashMap<String, Integer> shopList = new HashMap<>();
    shopList.put("Eggs", 200);
    shopList.put("Milk", 200);
    shopList.put("Fish", 400);
    shopList.put("Apples", 150);
    shopList.put("Bread", 50);
    shopList.put("Chicken", 550);


    Iterator sIt = shopList.entrySet().iterator();

    System.out.println("Product under 201: ");
    while (sIt.hasNext()) {

      Map.Entry mapElement = (Map.Entry) sIt.next();
      if (((int) (mapElement.getValue()) < 201)) {
        System.out.print(mapElement.getKey() + ", ");
      }
    }
  }
}
