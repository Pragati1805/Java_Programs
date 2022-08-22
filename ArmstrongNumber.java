import java.util.Scanner;
public class ArmstrongNumber 
{
	public int countNumber(int num)
	{
		int count=0;
		while(num>0)
		{
		num=num/10;
		count++;
		}
	return count;
	}
	
	public void armstrongNumber(int num,int power)
	{
		int r,sum=0,power1=power;
		int temp=num;
	
		while(num>0)
		{
			r=num%10;
			num=num/10;
			int mul=1;
			while(power>0)
			{
				mul=r*mul;
				power--;
			}
			sum=sum+mul;
			power=power1;
		}
		System.out.println("sum:"+sum);
		if(sum==temp)
			System.out.println("IS AMSTRONG NUMBER :");
		else
			System.out.println("IS NOT AMSTRONG NUMBER :");

	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		ArmstrongNumber am=new ArmstrongNumber();
		int count=am.countNumber(num);
		am.armstrongNumber(num,count);

		sc.close();
	}

}
