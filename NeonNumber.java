
public class NeonNumber
{
	public int neonNumber(int i)
	{
		 
		i=i*i;
		int sum=0;
		while(i>0)
		{
		int r=i%10;
		i=i/10;
		sum=sum+r;
		}		
		return sum;
		
	}
		

	public static void main(String[] args)
	{
	  NeonNumber nm=new NeonNumber();
	
	 for(int i=1;i<=20;i++)
	 {
		 if( nm.neonNumber(i)==i)
		 
	 System.out.println("Number is Neon : " +i);
		 
	 else
		 System.out.println("Number is not Neon: " +i);
		 }
	 
	}
	
	}


