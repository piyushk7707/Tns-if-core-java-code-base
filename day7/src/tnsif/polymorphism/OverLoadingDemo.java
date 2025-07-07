package tnsif.polymorphism;

public class OverLoadingDemo {
	public static void main(String[] args) {
		
		point p=new point();
		 System.out.println(p);
		 point p1=new point(20.09f,23.45f);
		 System.out.println(p1);
		
		 System.out.println("--------method overloading -------------");
		 System.out.println(Methodoverloading.addition(3.14f,23.12f,8.90f));

		 System.out.println(Methodoverloading.addition(9,6,7));

		 System.out.println(Methodoverloading.addition(5,6));
	}

}
