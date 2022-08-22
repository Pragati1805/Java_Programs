
public class NumberSeries {

	public static void main(String[] args) {
		int i=0;
		System.out.println("USING FOR LOOP:");
		for( i=1;i<=100;i++)
		{
			System.out.println(+i);
			
		}
		i++;
		
		
		System.out.println("USING while LOOP:");
		i=1;
		while(i<=100)
		{
			System.out.println(i);
			i++;
		}
		
		System.out.println("USING DO...while LOOP:");
		i=1;
		do
		{
			System.out.println(i);
			i++;	
		}while(i<=100);
		

		

	}

}
