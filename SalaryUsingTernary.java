import java.util.Scanner;
public class SalaryUsingTernary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Basic Salary : ");
		int bs;
		double hra,da;
		double gs=bs<=10000 ? da=bs*0.2D+"\n"+hra=bs*0.80D : bs<=20000 ? hra=bs*0.25D+"\n" +da=bs*0.90D : bs>20000 ? hra=bs*0.30D +"\n"+da=(bs*0.95D) : "enter number again";
		
				gs=hra+da+bs;
				System.out.println("Gross Salary is :"+gs);
	
}
