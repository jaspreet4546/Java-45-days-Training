import java.util.Scanner;
public class Sort{

public static void main(String []args){
 int temp = 0;
 int arr[];
 
Scanner sc = new Scanner(System.in);
 	System.out.println("Enter the size of the array:");
	int n = sc.nextInt();
 
arr = new int[n];
for(int  i = 0 ; i < n ; i++){
	System.out.println("Enter the element at "+i+"position");
	arr[i]= sc.nextInt();
}
for(int i = 0 ; i<n;i++){
	System.out.println("The Entered array  is "+arr[i]);
}
System.out.println("Enter the order in which you want to sort the array :");
int num = sc.nextInt();

if(num == 1){
for(int i = 0 ; i < n;i++){
	for(  int j = i+1 ; j < n ;j++){
		if(arr[i]>arr[j]){
			temp = arr[j];
			arr[j]=arr[i];
			arr[i]= temp;

			}
		}
	}
}
else{
	for(int i = 0 ; i < n;i++){
	for(  int j = i+1 ; j < n ;j++){
		if(arr[i]<arr[j]){
			temp = arr[j];
			arr[j]=arr[i];
			arr[i]= temp;

			}
		}
	}
}
for(int i = 0 ; i<n;i++){
	System.out.println("The sorted array is:"+arr[i]);
}

}
}


	 

	
	

