package Fibonacci_Series;

public class test10 
{
   public static void main(String[] args) {
	
	   int a=10;
	   int x=0;
	   int y=1;
	   int z=0;
	   
	   for(int i=1; i<=a; i++)
	   {
		  x=y;
		  y=z;
		  z=x+y;
		  System.out.println(z);
		   
	   }
}
}
