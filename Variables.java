import java.util.Scanner;
public class Variables{
    public static void main(String []args){
      int a;

//Integer value
      System.out.println("Enter the value for an interger:");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      System.out.println("The entered value of an interger is :"+a);

//Float value
      System.out.println("Enter the value for a Float:");
      Scanner sc1=new Scanner(System.in);
      float b=sc1.nextFloat();
      System.out.println("The entered value of a Float is :"+b);

//Double value
      System.out.println("Enter the value for a Double:");
      Scanner sc2=new Scanner(System.in);
      double c=sc2.nextDouble();
      System.out.println("The entered value of a Double is :"+c);

//Character value
      System.out.println("Enter a character:");
      Scanner sc3=new Scanner(System.in);
      char d=sc3.next().charAt(0);
      System.out.println("The entered value of a Double is :"+d);
}
}