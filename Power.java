import java.util.Scanner;
public class Power
{
	public int power(int base,int po)

	{
		int ans = 1;
		for(;po>0;po--)
		{
		ans= ans*base;
		}
		return ans;
	}
		
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base Number :");
		int base=sc.nextInt();
		System.out.println("Enter value of power: ");
		int po=sc.nextInt();
		Power p=new Power();
		int b=p.power(base,po);
		System.out.println("The power of number is :"+b);
		sc.close();
		
	}

}
