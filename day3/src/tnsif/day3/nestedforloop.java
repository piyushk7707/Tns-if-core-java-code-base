package tnsif.day3;

public class nestedforloop {

	public static void main(String[] args) {
		int beg=2;
		int end=20;
		for( int i=beg;i<=end;i++)
		{
			System.out.println("table of "+i);
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+  i*j);
			}
			
			
			System.out.println(" ");
		}

	}

}
