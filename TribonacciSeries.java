//import java.util.Scanner;
public class TribonacciSeries
{
	public int checkSeries(int num)
	{
		int n3=0,n4=0,n5=0;
		for(int i=2;i<=num;i++)
		n3=n1+n2;
		System.out.println(n3);
		n4=n3+n2+n1;
		n5=n4+n3+n2+n1;
		return n5;
		
	}

	public static void main(String[] args) 
	{
	//	Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Number : ");
		//int num=sc.nextInt();
		int n1=0,n2=1;
		TribonacciSeries obj=new TribonacciSeries();
		System.out.println(n1+"\n"+n2);
		int num;
		int	n5=obj.checkSeries(num);
		

	}

}
