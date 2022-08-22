import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer Number : ");
		int count = 0,no;
		no=sc.nextInt();
		while(no!=0)
		{
			no=no/10;
			count++;
		}
		System.out.println("The Number Of Digits in Number : "+count);
		sc.close();
	}


}
