import java.util.HashMap;

public class MapIntroduction1 {
  public static void main(String[] args) {
    HashMap<Integer, String>FirstHashMap = new HashMap<>();
    System.out.println(FirstHashMap.isEmpty());
    FirstHashMap.put(97, "a");
    FirstHashMap.put(98, "b");
    FirstHashMap.put(99, "c");
    FirstHashMap.put(65, "A");
    FirstHashMap.put(66, "B");
    FirstHashMap.put(67, "C");
    System.out.println(FirstHashMap.keySet());
    System.out.println(FirstHashMap.values());
    FirstHashMap.put(68, "D");
    System.out.println(FirstHashMap.size());
    System.out.println(FirstHashMap.get(99));
    FirstHashMap.remove(97);
    System.out.println(FirstHashMap.containsKey(100));
    FirstHashMap.clear();
    System.out.println(FirstHashMap);

  }
}
