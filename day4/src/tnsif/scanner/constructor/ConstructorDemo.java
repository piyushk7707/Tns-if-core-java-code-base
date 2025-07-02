package tnsif.scanner.constructor;
import java.util.Scanner;
public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,city;
		int id;
		System.out.println("Enter Customer Id:");
		id=sc.nextInt();
		
		System.out.println("Enter Customer Name:");
		name=sc.nextLine();

		System.out.println("Enter Customer City:");
		city=sc.nextLine();
		
		
		
		System.out.println(" ");
		
		customer c1=new customer();
		
		c1.setCustomercity(city);
		c1.setCustomerid(id);
		c1.setCustomerName(name);
		System.out.println(c1);
		
		
		
		
	}

}
