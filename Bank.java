import java.util.Scanner;
public class Bank{
    int account;
    Scanner sc = new Scanner(System.in);

    public void AddAccount(){
        
            System.out.println("Enter your account number:");
            account = sc.nextInt();
    }
    public static void main(String []args){
        Bank bank = new Bank();
        bank.AddAccount();
    }

}