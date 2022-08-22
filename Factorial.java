import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int	no=sc.nextInt();
			int i,fact=1;
			for(i=1;i<=no;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of : "+no+": is: "+fact);
			sc.close();
	}

}
