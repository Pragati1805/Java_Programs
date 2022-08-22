import java.util.Scanner;

public class FibonnaciSeries 
{
	public int checkSeries(int num)
	{
		int n1=0,n2=1,n3=0;
		for(int i=2;i<=num;i++)
		{
			n3=n1+n2;
			System.out.println("" +n3);
			n1=n2;
			n2=n3;
		}
		return n3;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int	num=sc.nextInt();
		int n1=0,n2=1;
		System.out.println(n1+ "\n"+n2);
		FibonnaciSeries obj=new FibonnaciSeries();
		obj.checkSeries(num);
	
		sc.close();

	}

}
