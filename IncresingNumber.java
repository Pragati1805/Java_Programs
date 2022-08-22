import java.util.Scanner;

public class IncresingNumber 
{
		public boolean isIncreasing(int num)
			{
				int rem;
				boolean flag=false;
				int	max=num%10;
				num=num/10;
				while(num>0)
				{
					
					rem=num%10;
					
				if(max>rem)
				{
					flag=false;
					break;
				}
					max=rem;
					num=num/10;
				}
			
				return true;
		}
		public static void main(String args[])
		{
			int num;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number : ");
			num=sc.nextInt();
			IncresingNumber obj=new IncresingNumber();
			obj.isIncreasing(num);
			sc.close();

		}
		
	

}
