import java.util.Scanner;
public class reversenumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		n=scan.nextInt();
		
		while(n>0)
		{
			r=n%10;
			System.out.print(r);
			n=n/10;
		}

	}

}
