import java.util.Scanner;
public class Krishnamurthy 
{
	public int separateNumber(int num)
	{	
		int temp=num;
		int fact=1,sum =0;
		while(num>0)
		{	
			int rem=num%10;
			num=num/10;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}	
			
			sum=sum+fact;
			fact=1;	
		}
	
		if(sum==temp)
			System.out.println("Is krishnamurthy");
		else
			System.out.println("Is not Krishnamurthy");
		
		return num;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		Krishnamurthy k=new Krishnamurthy();
		k.separateNumber(num);

	}

}

	
