import java.util.Scanner;
  class A extends Marks{
    int Marks;
    float Percentage;
    
    int total = 0;
    int i ;
    Scanner sc = new Scanner(System.in);
    float getPercentage(){
        System.out.println("The percentage of three subjects is :"+Percentage);
        return Percentage;
    }
    A(){
        System.out.println("Enter the marks for three subjects:");
        int arr[] = new int[3];
        for( i = 0; i< 3; i++){
          arr[i]=sc.nextInt(); 
            total = arr[0]+arr[1]+arr[2];
        }
        Percentage = (total*100)/300;
    }
public static void main(String []args){
   A a = new A();
    a.getPercentage();
}
}