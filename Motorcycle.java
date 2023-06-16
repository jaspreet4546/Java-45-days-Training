import java.util.Scanner;
 public class Motorcycle extends Vehicle{
Scanner sc = new Scanner(System.in);
	public void getMotorFuel(String motorFuel){
	System.out.println("Enter the fuel type of the vehicle:");
	motorFuel = sc.nextLine();
	System.out.println("The fuel type of the vehicle is:" + motorFuel);
}
public static void main(String []args){
	Motorcycle motor= new Motorcycle();
	motor.getInfo("Tesla",2019,2019);
	motor.getMotorFuel("Petrol");
        
}
}