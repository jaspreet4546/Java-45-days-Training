public class Student{
 Student(){
   System.out.println("Unknown");
}
 Student(String name){
  System.out.println("The name of the Student is :"+name);
}

public static void main(String []args){
 Student student = new Student();
 Student student1 = new Student("Jaspreet");
}
}