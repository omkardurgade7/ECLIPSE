package Swap_Numbers;

public class test4 {

	
	//swap two numbers without using third variable

	public static void main(String[]args)
	{
	int a=1000; 
	int b=2000;

	a=a+b;
	b=a-b;
	a=a-b;

	System.out.println("a="+a);
	System.out.println("b="+b);
	}
}
