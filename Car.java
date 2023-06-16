import java.util.Scanner;
 public class Car extends Vehicle{
Scanner sc = new Scanner(System.in);
	public void getCarFuel(String carFuel){
	System.out.println("Enter the fuel type of the vehicle:");
	carFuel = sc.nextLine();
	System.out.println("The fuel type of the vehicle is:" + carFuel);
}
public static void main(String []args){
	Car car = new Car();
	car.getInfo("Tesla",2019,2019);
	car.getCarFuel("Petrol");
        
}
}