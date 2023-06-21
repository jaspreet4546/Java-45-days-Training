import java.util.Scanner;
public class SavingAccount implements Accounts{
    int saving,withdraw;
        Scanner sc = new Scanner(System.in);
        public void Deposit(){
            System.out.println("Enter the amount you want to save:");
         saving = sc.nextInt();
        }
        public void Withdraw(){
        System.out.println("Enter the amount you want to withdraw");
         withdraw = sc.nextInt();
    }
    public void ViewBalance(){
        int total = (saving - withdraw);
        System.out.println("your current balance is:"+total);
    }
    public void CalculateInterest(){
        System.out.println( "Enter the details to calculate interest");
        System.out.println("Enter your amount:");
        int amount = sc.nextInt();
        System.out.println("Enter rate of interest:");
        float rate = sc.nextInt();
        System.out.println("Enter time according to year:");
        int year = sc.nextInt();
        float Interest = amount * rate* year;
        System.out.println("The Interest on your amount is :"+Interest);
    }
    public static void main(String []args){
        SavingAccount savingacc = new SavingAccount();
        savingacc.Deposit();
        savingacc.Withdraw();
        savingacc.ViewBalance();
        savingacc.CalculateInterest();
        

    }
}