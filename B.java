import java.util.Scanner;
  class B extends Marks{
    int Marks;
    float Percentage;
    
    int total = 0;
    int i ;
    Scanner sc = new Scanner(System.in);
    float getPercentage(){
        System.out.println("The percentage of four subjects is :"+Percentage);
        return Percentage;
    }
    B(){
        System.out.println("Enter the marks for four subjects:");
        int arr[] = new int[4];
        for( i = 0; i< 4; i++){
          arr[i]=sc.nextInt(); 
            total = arr[0]+arr[1]+arr[2]+arr[3];
        }
        Percentage = (total*100)/400;
    }
public static void main(String []args){
   B b = new B();
    b.getPercentage();
}
}