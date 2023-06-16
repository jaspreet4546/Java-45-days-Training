import java.util.Scanner;
public class Vehicle{
 Scanner sc = new Scanner(System.in);
	public void getInfo(String manufacture, int model , int year){
 		System.out.println("Enter the manufacturing company:");
		manufacture = sc.nextLine();
		System.out.println("Enter the model of the vehicle:");
		model = sc.nextInt();
		System.out.println("Enter the year of manufacturing:");
		year = sc.nextInt();
}
public static void main(String []args){
	Vehicle vehicle = new Vehicle();
	vehicle.getInfo("Tesla",2019,2019);
}
}
	