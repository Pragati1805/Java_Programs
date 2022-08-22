
public class Test1Divide {

	public void divide()
	{
		int i;
		for(i=1;i<=100;i++)
		{
			if(i%3==0 && i%7==0)
				continue;
			
			System.out.print(" " +i + " ");
				
			
		}
	}
	public static void main(String[] args)
	{
		Test1Divide obj=new Test1Divide();
		obj.divide();

	}

}

