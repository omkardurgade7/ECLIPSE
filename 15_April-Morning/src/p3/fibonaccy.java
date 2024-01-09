package p3;

public class fibonaccy {

	
	public static void main(String[]args)
	{
		
		int i;
		int u=10;
		int a=0;
		int b=1;
		int c=0;
		
		for(i=1; i<=u; i++)
		{
			a=b; b=c; c=a+b;
			
			System.out.println(c);
			
			
			
		}
		
		
		
		
		
	}
}
