package tnsif.methodoverriding;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			RBI rbi;
			
			//Dynamic binding assigning child object to parent class reference variable 
			rbi=new SBI();
			System.out.println(rbi.getRateofintrest());
			
			rbi=new ICICI();
			System.out.println(rbi.getRateofintrest());
			
			rbi=new HDFC();
			System.out.println(rbi.getRateofintrest());

		

	}

}
