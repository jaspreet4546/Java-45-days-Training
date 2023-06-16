import java.util.Scanner;
public class EvenOddSum{
	public static void main(String []args){
         int Oddsum = 0;
         int Evensum = 0;
	Scanner sc = new Scanner(System.in);
		System.out.println("how many numbers you want to enter:");
		int n = sc.nextInt();

		int arr[] = new int[n];
			arr[0]=0;
			for(int i = 1;i<=n;i++){
				System.out.println("Enter the number at" +i+ "positon:");
				arr[i] = sc.nextInt();

			if(arr[i]%2 == 0){
 				Evensum = Evensum+arr[i];
					
}
			else{
				Oddsum = Oddsum+arr[i];
}
					
System.out.println(" The sum of even numbers is:"+ Evensum);
System.out.println("The sum of odd numbers is:"+ Oddsum);
}
}
}
