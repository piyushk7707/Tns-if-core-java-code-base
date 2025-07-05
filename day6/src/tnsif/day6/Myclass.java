package tnsif.day6;



public class Myclass {

	private int section;

	private static int srNo;
	
	static {
		System.out.println("------------within static block----------");
		srNo=1000;
		
	}
	
	public Myclass(){
		System.out.println(" this is default constructor");
		srNo++;
		section++;
		
		
	}
	
	@Override
	public String toString() {
		return "Myclass [serial no" +srNo+ ",section=" + section + "]";
	}

	 static void display()
	 {
		 
		System.out.println("serial no:"+srNo);
		
		
	}

 
}
