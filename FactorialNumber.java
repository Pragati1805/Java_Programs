import java.util.Scanner;
public class FactorialNumber 
{
	public int factorial(int num)
	{
		int i,fact=1;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
			return fact;
		
	}
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=Sc.nextInt();
		FactorialNumber obj = new FactorialNumber();
		int fact=obj.factorial(num);
		System.out.println("The FActorial is : "+fact);
		Sc.close();

	}

}
