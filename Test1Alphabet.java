
public class Test1Alphabet 
{
	public void alphabet()
	{
		char ch;
		for(ch='z' ; ch>='a';ch--)
		{
			System.out.println(ch);
		}
	}
	public static void main(String args[])
	{
		Test1Alphabet obj= new Test1Alphabet();
		obj.alphabet();
	}


}