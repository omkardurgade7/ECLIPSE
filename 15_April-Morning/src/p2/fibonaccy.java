package p2;

public class fibonaccy {

	public static void main(String[]args)
	{
	    int i;
		int x=10;
		
		int a=0;
		
		int b=1; 
		int c=0;;
		
		for(i=1; i<=x; i++)
		{
			a=b; b=c; c=a+b;
			
			System.out.println(c);
		}
		
		
	}
}
