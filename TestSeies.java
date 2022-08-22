import java.util.Scanner;
public class TestSeies
{
		public void Operation(int num)
		{
			int i;
			for(i=1;i<=num;i=i*2+1)
			{

				System.out.print(" "+i +" ");
			}
		}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		TestSeies t=new TestSeies();
		t.Operation(num);
		sc.close();

	}

}
