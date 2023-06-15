import java.util.Scanner;
import java.lang.Math;
public class Power{
   Scanner sc = new Scanner(System.in);
        public void power(int a,int b){
       System.out.println("Enter the base number:");
        a = sc.nextInt();
       System.out.println("Enter the exponent number:");
         b = sc.nextInt();
   System.out.println("Result is :"+(Math.pow(a,b)));

}
public static void main(String []args){
   Power obj = new Power();
    obj.power(2,3);
}
}