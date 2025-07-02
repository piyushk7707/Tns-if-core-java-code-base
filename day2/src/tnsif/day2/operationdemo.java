package tnsif.day2;

public class operationdemo {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int x=10;
		System.out.println("A and B value before operation:"+ a + " " +b);
		++a;
		int c= ++a +b +a--;
		System.out.println("C values after the operator :"+ c);
		int d= c++ +a +b--;
		System.out.println("D values after the operator :"+ d);
		if (a==10)
		{
			System.out.println("value of a is 10");
			
		}
		else {
			System.out.println("a is increamenting at the line 9");
		}
		if (b==10)
		{
			System.out.println("value of b is 10");
		}
		if (x==10) {
			System.out.println("value of x is 10");
		
		}
		
	}

}
