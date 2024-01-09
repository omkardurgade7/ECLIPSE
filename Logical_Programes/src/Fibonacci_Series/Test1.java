package Fibonacci_Series;

public class Test1 {

	
	    public static void main(String[] args) {
			
	    	int a=10,b=0,c=1,d=0;
	    	
	    	for(int i=1; i<=a; i++)
	    	{
	    		b=c; c=d; d=b+c;
	    		System.out.println(d);
	    	}
	    	
		}
}
