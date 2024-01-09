package Fibonacci_Series;

public class Fibo_3 {
     public static void main(String[] args) {
		
        int fibo=10,x=1,y=1,z=0;
        
        for(int a=1; a<=fibo; a++)
        {
        	x=y;  y=z; z=x+y;
        	System.out.println(z);
        }
    	 
    	 
    	 
	}
}
