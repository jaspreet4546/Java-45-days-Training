import java.util.Scanner;
public class Currency{
    public static void main(String []args){
        int temp1=0,temp2=0,temp3=0,temp4=0,temp5=0,temp6=0,temp7=0,temp8=0,temp9=0,temp10=0,temp11=0;
        int count= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of currency denomination");
        int size = sc.nextInt();
        for (int i = 0 ; i < size ; i++){
            System.out.println("Enter the currency denomination");
            int deno = sc.nextInt();
        }
        System.out.println("Enter the amount you want to pay:");
        int pay = sc.nextInt();
        System.out.println("Your payment approach in order to give min no of notes will be ");
        while (pay >= 2000){
            temp1 = pay / 2000;
			pay = pay % 2000;
			System.out.print("Total Number Of 2000 Rupees Notes :" + temp1);
			break;
		}
         while (pay >= 1000){
            temp2 = pay / 1000;
			pay = pay % 1000;
			System.out.println("Total Number Of 1000 Rupees Notes :" + temp2);
			break;
		}
         while (pay >= 500){
            temp3 = pay / 500;
			pay = pay % 500;
			System.out.println("Total Number Of 500 Rupees Notes :" + temp3);
			break;
		}
        while (pay >= 200){
            temp4 = pay / 200;
			pay = pay % 200;
			System.out.println("Total Number Of 200 Rupees Notes :" + temp4);
			break;
		}
        while (pay >= 100){
            temp5 = pay / 100;
			pay = pay % 100;
			System.out.println("Total Number Of 100 Rupees Notes :" + temp5);
			break;
		}
        while (pay >= 50){
            temp6 = pay / 50;
			pay = pay % 50;
			System.out.println("Total Number Of 50 Rupees Notes :" + temp6);
			break;
		}
        while (pay >= 20){
            temp7 = pay / 20;
			pay = pay % 20;
			System.out.println("Total Number Of 20 Rupees Notes :" + temp7);
			break;
		}
        while (pay >= 10){
            temp8 = pay / 10;
			pay = pay % 10;
			System.out.println("Total Number Of 10 Rupees Notes :" + temp8);
			break;
		}
        while (pay >= 5){
            temp9 = pay / 5;
			pay = pay % 5;
			System.out.println("Total Number Of  5 Rupees Notes :" + temp9);
			break;
		}
        while (pay >= 2){
            temp10 = pay / 2;
			pay = pay % 2;
			System.out.println("\nTotal Number Of 2 Rupees Notes :" + temp10);
			break;
		}
        while (pay >= 1){
            temp11 = pay / 1;
			pay = pay % 1;
			System.out.println("\nTotal Number Of 1 Rupees Notes :" + temp11);
			break;
		}
    Total = temp1+temp2+temp3+temp4+temp5+temp6+temp7+temp8+temp9+temp10+temp11;
       System.out.println("Total denomination is "+Total);
        }
    }
