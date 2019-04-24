public class Main {
  public static void main(String[] args) {
    /*Student johnTheOriginal = new Student();

    johnTheOriginal.name = "Jane Doe";
    johnTheOriginal.age = 30;
    johnTheOriginal.gender = "female";*/


    //Student johnTheClone = (Student)johnTheOriginal.clone();
    Student johnTheClone = new Student();

    johnTheClone.name = "Joe";
    johnTheClone.age = 20;
    johnTheClone.gender = "male";
    johnTheClone.previousOrganization = "BME";

    System.out.println(johnTheClone.name + " " + johnTheClone.age + " " + johnTheClone.gender + " " + johnTheClone.previousOrganization);
  }
}
