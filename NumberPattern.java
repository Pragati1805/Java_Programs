import java.util.Scanner;
public class NumberPattern
{
	public int numberSequence(int num)
	{
		int i;
		for(i=1;i<=num;i+=3)
			System.out.println(i);	
		
		return i;
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number");
		int num=sc.nextInt();
		NumberPattern obj=new NumberPattern();
		obj.numberSequence(num);
		sc.close();

	}

}
