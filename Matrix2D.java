import java.util.Scanner;
public class Matrix2D{
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of row:");
    int row1 = sc.nextInt();
    System.out.println("Enter the number of column");
    int column1 =sc.nextInt();

//Second Matrix
    System.out.println("Enter the number of row of second matrix:");
    int row2 = sc.nextInt();
    System.out.println("Enter the number of column of second matrix");
    int column2 = sc.nextInt();

//Entering the values 

 int array1[][]  = new int[row1][column1];
System.out.println("Enter the elements of the first matrix:");
	 for(int i = 0; i<row1; i++){
   		for(int j =0; j<column1; j++){
 			 System.out.println("Enter the value at " +i    +j + "position");
 
    			array1[i][j] = sc.nextInt();
			}
		}

  int array2[][] = new int[row2][column2];
System.out.println("Enter the elements of second matrix:");
	 for(int i = 0; i<row2; i++){
  		 for(int j = 0; j<column2; j++){
 			 System.out.println("Enter the value at" +i   +j + "position :" );
  			 array2[i][j]= sc.nextInt();
		}
 }

//Addition of Matrix


int sum[][]=new int[row1][column1];
	if (row1==row2 && column1==column2){
				System.out.println("Addition of two Matrix is:");
		
				for(int i = 0 ; i<row1 ; i++){
					for(int j = 0  ;j<column1;j++){
					sum[i][j]= array1[i][j] + array2[i][j];
				}
			}
			System.out.println("The sum is : ");
			for(int i = 0 ; i<row1 ; i++){
					for(int j = 0;j<column1;j++){
					System.out.println(sum[i][j]);
				}
			}
		}
		
	else {
		System.out.println("Additon is not possible!!");}
		
	
}
}