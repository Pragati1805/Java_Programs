import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num,sum=0,temp,x = 0;
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			x=num%10;
			sum=(sum*10)+x;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("The Number Is Palindrome :"+sum);
		else
			System.out.println("The Number Is Not Palindrome : "+sum);
		sc.close();
	}

}
