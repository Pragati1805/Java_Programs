
public class UseOfContinue
{
	public void useContinue(int num)
	{
		int cnt=0;
		while(cnt<=20)
		{
			cnt+=2;
			if(cnt==10)
				continue;
			System.out.println(cnt);
		}
	}

	public static void main(String[] args) 
	{
		UseOfContinue obj=new UseOfContinue();
		int num = 0;
		obj.useContinue(num);
		

	}

}
