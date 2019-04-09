import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class ListIntroduction1 {
public static void main (String [] args) {
  List<String> listOfNames = new ArrayList <>();
  System.out.println(listOfNames);
  listOfNames.add("William");
  System.out.println(listOfNames.isEmpty());
  listOfNames.add("John");
  listOfNames.add("Amanda");
  System.out.println(listOfNames.size());
  System.out.println(listOfNames.get(2));
  //System.out.println(listOfNames);
  for(int i=0;i<listOfNames.size();i++){
    System.out.println(listOfNames.get(i));
  }
  int counter = 1;
  int j = 0;
  for(String names: listOfNames){
    System.out.println("" + counter + ". " + listOfNames.get(j));
    counter++;
    j++;
  }
  listOfNames.remove(1);
  Collections.reverse(listOfNames);
  for(int i=0;i<listOfNames.size();i++) {
    System.out.println(listOfNames.get(i));
  }
  listOfNames.removeAll(listOfNames);
  System.out.println(listOfNames);
  }
}
