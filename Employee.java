import java.util.Scanner;
public class Employee extends Person{
 Scanner sc = new Scanner(System.in);
 	public void getEmployeeId(int Id){
		System.out.println("Enter the EmployeeId:");
                 Id = sc.nextInt();
		System.out.println("The EmployeeID is :"+ Id);
}
public static void main(String [] args){
	Employee employee = new Employee();
	employee.getEmployeeId(1234);
        employee.getFirstName("Jaspreet");
	employee.getLastName("kaur");

}		
}