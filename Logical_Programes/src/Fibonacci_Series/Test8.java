package Fibonacci_Series;

public class Test8 {
	//fibonaccy series
	public static void main(String[]args)
	{
	int a=15;
	int x=0;
	int y=1;
	int z=0;

	for(int i=1; i<=a; i++)
	{
	x=y; y=z; z=x+y;
	System.out.println(z);


	}


	}
}
