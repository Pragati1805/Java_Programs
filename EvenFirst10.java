
public class EvenFirst10 {

	public static void main(String[] args) {
			System.out.println("USING WHILE LOOP");
			int i=1;
			for(i=1;i<=20;i++)
			
				while(i%2==0)
			{
	 			System.out.println(i);
	 			i++;

			}

			System.out.println("USING DO  WHILE LOOP");
			
			for(i=2;i<=20;i++)
			do
			{
				System.out.println(i);
	 			i++;

			}while(i%2==0);
	}

}
