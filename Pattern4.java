import java.util.Scanner;
public class Pattern4{
    public static void main(String []args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the number of rows");
    int row= sc.nextInt();
     
    
     for(int i=0;i<=row;i++){
        for(int j=1;j<=i;j++){
         System.out.print(+i);
           }
      System.out.println(" ");
      }

}
}