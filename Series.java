public class Series
{
	public void Operation()
	{
		int i;
		for(i=1;i<=200;i=(i*2)+1)
		{
			System.out.print(" "+i+"");


		}
		//num=num+2;

	}
	
	public static void main(String[] args) 
	{
		
		Series s=new Series();
		s.Operation();
	}

}
