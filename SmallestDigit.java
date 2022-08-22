import java.util.Scanner;
public class SmallestDigit {
	public int HMDigits(int num)
	{
		int rem=0;
		int min=num%10;
		while(num>0)
		{
			rem=num%10;
			if(rem<min)
			min=rem;
			num=num/10;
			
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int no=sc.nextInt();
		SmallestDigit obj=new SmallestDigit();
		int m= obj.HMDigits(no);
		System.out.println("The smallest Of Digits are :"+m);
		sc.close();
	}

}
