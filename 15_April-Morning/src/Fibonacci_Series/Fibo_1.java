package Fibonacci_Series;

public class Fibo_1 {

	    public static void main(String[] args) {
			
	    	
	    	int j=10;
	    	
	    	int e=0;
	    	int f=1;
	    	int g=0;
	    	for(int i=1; i<=j; i++) {
	    	e=f; f=g; g=e+f;
	    	
	    	System.out.println(g);
	    	}
		}
}
