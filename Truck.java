import java.util.Scanner;
 public class Truck extends Vehicle{
Scanner sc = new Scanner(System.in);
	public void getFuel(String Fuel){
	System.out.println("Enter the fuel type of the vehicle:");
	Fuel = sc.nextLine();
	System.out.println("The fuel type of the vehicle is:" + Fuel);
}
public static void main(String []args){
	Truck truck = new Truck();
	truck.getInfo("Tesla",2019,2019);
	truck.getFuel("Petrol");
        
}
}
