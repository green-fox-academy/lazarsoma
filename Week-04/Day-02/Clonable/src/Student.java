
public class Student extends Person implements Cloneable {
  String previousOrganization;
  int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization){
    super(name, age, gender);
    this.previousOrganization = previousOrganization;

  }
  public Student(){
    super();
    this.previousOrganization = "the school of life";
    this.skippedDays = 0;
  }

  @Override
  public void introduce() {
    super.introduce();
    System.out.print(" from " + previousOrganization + " who skipped " + skippedDays + " days from the course already." );
    //System.out.println("Hi, I'm " + name + "," + " a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already." );

  }

  @Override
  public void getGoal() {
    super.getGoal();
    System.out.println("Be a junior software developer.");
  }
  public void skipDays(int numberOfDays){
    this.skippedDays += numberOfDays;
  }

  public Object clone() throws
          CloneNotSupportedException
  {
    return super.clone();
  }
}

