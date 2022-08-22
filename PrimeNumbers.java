import java.util.Scanner;
public class PrimeNumbers {
		
	public int checkPrime(int num)
	{
		int i,flag=0;
		for(i=2;i<num;i++)
		   {
			if(num%i==0)
				flag++;
		   }
	 return flag;	
	}
		
		

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter Number to check prime or not");
	    int	num=sc.nextInt();
		PrimeNumbers pn=new PrimeNumbers();
	    int flag=pn.checkPrime(num);
	    if(flag==0)		
			System.out.println(num+" is Prime");
		else
			System.out.println("NOt Prime");
		sc.close();
	}
}
	

