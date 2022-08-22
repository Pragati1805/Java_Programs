import java.util.Scanner;
public class LargestDigit {
	public int largeDigits(int num)
	{
		int rem=0;
		int larg=num%10;
		while(num>0)
		{
			rem=num%10;
			if(rem>larg)
			larg=rem;
			num=num/10;
			
		}
		return larg;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int no=sc.nextInt();
		LargestDigit obj=new LargestDigit();
		int l= obj.largeDigits(no);
		System.out.println("The smallest Of Digits are :"+l);
		sc.close();
	}

}
