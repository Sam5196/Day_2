package Sum;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rev=0,rem;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		num=scan.nextInt();
		
		for( ;num != 0; num=num/10)   
		{  
		rem = num % 10;  
		rev = rev * 10 + rem;  
		}  
		System.out.println("The reverse of the given number is: " + rev);  
	}

}
