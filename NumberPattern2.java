import java.util.Scanner;
public class NumberPattern2
{
	public int checkSquare(int num)
	{
		int sq = 0,i;
		for(i=1;i<=num;i++)
		{
			sq=i*i;
			System.out.println("The Square of "+i + " is : "+sq);
		}
		

		return i;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		NumberPattern2 obj=new NumberPattern2();
		obj.checkSquare(num);
		sc.close();

	}

}
