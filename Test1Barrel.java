public class Test1Barrel {
	public void barrel( )
	{
		int barrel,price;
		for(barrel=1;barrel<=20;barrel++)
		{
			if(barrel<=10)
			{
				price=barrel*89;
				System.out.println("Price of "+barrel +" barrel is : "+price);
			}
			else
				if(barrel>10)
				{
					price=barrel*(89-barrel);
					System.out.println("Price of "+barrel +" barrel is : "+price);
				}	
		}
	}

	public static void main(String[] args)
	{
	
		Test1Barrel obj=new Test1Barrel();
		obj.barrel();

	}

	

}
