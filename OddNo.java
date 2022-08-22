
public class OddNo {

	public static void main(String[] args) {
		int no=200;
		for(no=200;no<=300;no++)
		{
			while(no%2!=0)
			{
				System.out.println("Odd No is : "+no);
				no++;
			}
		}
			System.out.println("USING DO....WHile");
			no=200;
			for(no=200;no<=300;no++)
			{
			do
			{
				System.out.println("Odd NO is : "+no);
				no++;
			}while(no%2!=0);
			
			}

	}

}
