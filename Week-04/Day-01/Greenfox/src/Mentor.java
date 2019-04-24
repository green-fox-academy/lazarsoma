public class Mentor extends Person {
  String level;

  public Mentor(String name, int age, String gender, String level){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }
  public Mentor(){
    super();
    this.level = "intermediate";
  }

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    super.introduce();
    System.out.println(level + "mentor.");
  }
}
