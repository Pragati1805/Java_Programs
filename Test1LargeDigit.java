import java.util.Scanner;
public class Test1LargeDigit 
{
	public int max(int num)
	{
		int rem;
	int	max=num%10;
		
		while(num>0)
		{
			rem=num%10;
			
		if(rem>max)
			max=rem;
			num=num/10;
		}
		System.out.println("max="+max);
			return max;
}
public static void main(String args[])
{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number : ");
	num=sc.nextInt();
	Test1LargeDigit m=new Test1LargeDigit();
	m.max(num);
	sc.close();

}
}