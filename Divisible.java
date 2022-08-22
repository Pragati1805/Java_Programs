
public class Divisible
{
	public void divide()
	{
		int i;
		for(i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
				continue;
			
			System.out.print(" " +i + " ");
				
			
		}
	}
	public static void main(String[] args)
	{
		Divisible obj=new Divisible();
		obj.divide();

	}

}
