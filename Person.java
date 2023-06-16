import java.util.Scanner;
public class Person{
Scanner sc = new Scanner(System.in);
  public void getFirstName(String Firstname){
	System.out.println("Enter the First Name:" );
        Firstname = sc.nextLine();
	System.out.println(" The First Name of the person is:"+Firstname );

}
  public void getLastName(String Lastname){
        System.out.println("Enter the last name:" );
        Lastname = sc.nextLine();
        System.out.println("The Last name of the person is :"+ Lastname);
}
public static void main(String []args){
     Person person = new Person();
person.getFirstName("Jaspreet");
person.getLastName("Kaur");
}
}