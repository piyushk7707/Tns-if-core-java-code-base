package tnsif.day8;

public class shapeDemo {
public static void main(String[] args) {
		
		
		shape s;
		
		s=new Square();
		s.calArea();
		s.show();
		
		s=new Rectangle();
		s.calArea();
		s.show();
		
		s=new Square(25.89f);
		s.calArea();
		s.show();
		
		s=new Rectangle(12, 11);
		s.calArea();
		s.show();

	}

}
