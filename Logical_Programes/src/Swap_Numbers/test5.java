package Swap_Numbers;

public class test5 {
	//swap two numbers without using third variable

	public static void main(String[]args)
	{
	int a=121212;
	int b=212121;

	a=a+b;
	b=a-b;
	a=a-b;

	System.out.println("a="+a);
	System.out.println("b="+b);

	}
}
