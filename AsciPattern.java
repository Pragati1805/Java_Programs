import java.util.Scanner;
public class AsciPattern
	{
	public int doIt(int rows,int column)
	{
	char ch= 'a';
	int i,j;
		for(i=1;i<=column;i++)
		{
			for(j=1;j<=i;j++)
			{
			
				System.out.print(" "+ch);
				ch++;
				
			}
			System.out.println("");
		}
		return column;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Rows :");
		int rows=sc.nextInt();
		System.out.println("Enter column :");
		int column=sc.nextInt();
		AsciPattern obj=new AsciPattern();
		obj.doIt(rows,column);
		sc.close();
				

	}

}
