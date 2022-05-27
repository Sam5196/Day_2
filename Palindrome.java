package Sum;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,a,b,rem;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=scanner.nextInt();
		 a=num;
		    for(b=0;num>0;num/=10)
		    {
		    rem=num%10;
		    b=(b*10)+rem;
		    }
		   if(b==a)
			System.out.println(a+" is palindrome number ");
	                  else
			System.out.println(a+" is not palindrome number ");
			   
	}

}
