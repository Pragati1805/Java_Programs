import java.util.Scanner;

public class SmallDigit 
{
	public int min(int num)
	{
		int rem;
	int	min=num%10;
		
		while(num>0)
		{
			rem=num%10;
			
		if(rem<min)
			min=rem;
			num=num/10;
		}
		System.out.println("min="+min);
			return min;
}
public static void main(String args[])
{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number : ");
	num=sc.nextInt();
	SmallDigit m=new SmallDigit();
	m.min(num);
	sc.close();

}
}
