import java.util.Scanner;
public class Test1Power 
{
	public int power(int num)
	{
		int pow=0,ans=1,count=0;
		while(num>0)
		{
		
			//int rem = num%10;
			pow=num/10;
			count++;
		}
		System.out.println("Count"+count);
		int rem=num%10;
			count=pow;
		for(;pow>0;pow--)
			ans=ans*rem;
		
		return count;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();		
		Test1Power obj=new Test1Power();
		obj.power(num);
		sc.close();
	}

}
