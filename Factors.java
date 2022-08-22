import java.util.Scanner;
public class Factors 
{
	public int factor(int num)
	{
		int i;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			System.out.println("The Factors of "+num +" is :"+i);
				
		}
			return num;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		Factors f=new Factors();
		int num1=f.factor(num);
		sc.close();
	}

}
