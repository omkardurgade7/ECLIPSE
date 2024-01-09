package p1;

public class fobnaccy {

	
	public static void main(String[]args)
	{
		
		int x=10; 
		int a=0;
		int b=1; 
		int c=0;
		
		for(int i=1; i<=x; i++)
		{
			
			a=b; b=c; c=a+b;
			
			System.out.println(c);
			
			
		}
		
		
		
	}
}
