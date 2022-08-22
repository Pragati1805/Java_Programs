
public class Table {
	public void table(int num)
	{

			int i,ans=0;
			for(i=1;i<=10;i++)
			{
				ans=num*i;
				if(i==5)
				continue;
			System.out.println(ans);
		}
	}

	public static void main(String[] args) 
	{
		Table obj=new Table();
		int num =5;
		obj.table(num);
		

	}




	}


