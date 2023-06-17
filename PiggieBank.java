import java.util.Scanner;
public class PiggieBank{
	int amount = 50;
PiggieBank(){
	System.out.println("Your amount in the Piggie Bank is "+amount+" as your deposited 0 amount");
}
PiggieBank(int a){
	this.amount = amount;
	amount+=a;
	System.out.println("The amount in the Piggie Bank is :"+amount);
}

// function for the entering amount multiple times

Scanner sc = new Scanner(System.in);
public void Balance(){
 int Total = 0;
	System.out.println("Enter the amount");
	for( ; ; ){
		int n = sc.nextInt();
		if(n==0){
			 System.out.println("The amount in piggie bank is "+Total);
			break;
		}
		else if(n<0){
                         System.out.println("The amount in piggie bank is "+Total);
			break;
		}
			
			
		else{

			 Total+=n;
	                 System.out.println("The total amount is :"+Total);
}
}
}	
public static void main(String []args){

	PiggieBank pg = new PiggieBank();
	PiggieBank pg2 = new PiggieBank(234);
	pg.Balance();
}
}