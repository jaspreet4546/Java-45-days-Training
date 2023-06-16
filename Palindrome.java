import java.util.Scanner;
public class Palindrome{
	public static void main(String arg[])	
	{
	    int num,temp,reverse,rem;
             	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any number ");
                   num=sc.nextInt();
	    temp=num;
	    for(reverse=0 ; num>0 ; num/=10)
	    {
	    rem=num%10;
	    reverse = (reverse*10)+rem;
	    }
	   if(reverse==temp){
		System.out.println(temp+" is a palindrome number ");
}
                  else{
		System.out.println(temp+" is not a palindrome number ");
}
                  
	}
}
