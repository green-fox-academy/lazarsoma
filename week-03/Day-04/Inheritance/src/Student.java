public class Student {
  String name;
  int age;
  String gender;
  String previousOrganizaton;
  int skippedDays;

  public Student(String name, int age, String gender, String previousOrganizaton){
    this.skippedDays = 0;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganizaton = previousOrganizaton;

  }
  public Student(){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganizaton = "The School of life";
    this.skippedDays = 0;
  }
  public void introduce(){
    System.out.println("Hi, I'm " + name + "," + " a " + age + "year old " + gender + "from " + previousOrganizaton + " who skipped " + skippedDays + " days from the course already.");
  }
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }
  public void skipDays(int numberOfDays){
    this.skippedDays += numberOfDays;
  }
}
