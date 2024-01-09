package Fibonacci_Series;

public class Test9 
{
    public static void main(String[] args) {
		
    	int a=10;
    	int x=0,y=1,z=0;
    	
    	for(int i=1; i<=a; i++)
    	{
    		x=y; 
    		y=z; z=x+y;
    		System.out.println(z);
    	}
    
	}
}
