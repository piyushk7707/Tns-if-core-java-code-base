package tnsif.day9Array;

class ArrayOperations
{
	
	static void printArray(int[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i] + "\t");
			System.out.println();
		}
	}
	
	
	
	public static int getSum(int... n)
	{
		int sum=0;
		for(int no : n)
			sum +=no;
		return sum;
	}
	
	
	
	public static int getOddCount(int b[])
	{
		int count=0;
		for(int i=0; i<b.length; i++)
		{
			if(b[i] % 2 !=0)
				count++;
		}
		return count;
	}
	
	
	public static int getEvenCount(int b[])
	{
		return b.length-getOddCount(b);
		
	}
}

public class ArrayDemoone {

	public static void main(String[] args) {
		
		int n=10;
		int a[]; 
		a=new int[n]; 
		
		
		ArrayOperations.printArray(a);
		
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=5*i;
			ArrayOperations.printArray(a);
			
		}
		
		int b[] = {10,20,30,40,50}; 
		ArrayOperations.printArray(b);
		
		
		System.out.println("Sum of array elements is :"+ ArrayOperations.getSum(b));
		System.out.println("Sum of array elements is : "+ ArrayOperations.getSum(10,20,30,40,60,80));
		
		b[2]= 999; 
		
		ArrayOperations.printArray(b);
		
		
		System.out.println("Odd number : "+ ArrayOperations.getOddCount(b)
		+"\t Even no "+ ArrayOperations.getEvenCount(b));
	
		System.out.println();
		
		

	}

}