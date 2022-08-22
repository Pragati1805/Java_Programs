import java.util.Scanner;
public class SumOfDigits
{
	
	public int showDigits(int n ) 
		{
		int s=0;
		while(n>0) 
		    {
		
			int digit=n%10;
				s=s+digit;
				n=n/10;		
		    }
		return s;
		}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int no=sc.nextInt();
		SumOfDigits obj=new SumOfDigits();
	int	sum=obj.showDigits(no);
		System.out.println("Sum Of Digits : "+sum);
		sc.close();
	}
}
