public class Student {


  public Student(){

  }

  public void learn (){
    System.out.println("I learnt something.");

  }
  public void question(Teacher teacher) {
    System.out.println("What is the capital of Hungary?");
    teacher.answer();
  }

}

