import java.util.Scanner;
public class ConsecutiveNum{
 public static void main(String []args){
   Scanner sc = new Scanner(System.in);
     System.out.println("Enter First number:");
      int a = sc.nextInt();
     System.out.println("Enter Second number:");
      int b = sc.nextInt();
     System.out.println("Enter third number:");
      int c = sc.nextInt();
    if((b == a + 1) ){
      if((c== a + 2)){
     System.out.println("These are consecutive numbers.");
     }
}
    else{
     System.out.println("These are not consecutive numbers.");
}  
}
}

   