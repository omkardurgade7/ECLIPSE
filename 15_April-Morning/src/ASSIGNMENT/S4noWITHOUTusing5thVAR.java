package ASSIGNMENT;

public class S4noWITHOUTusing5thVAR {

	//swapping 4 no.s without using 5th variable
	public static void main(String[] args)
	{
		
		
		int a=20;
		int b=30;
	    int c=40;
		int d=50;
		
		a=a+b+c+d; //20+30+40+50=140
		b=a+b+c+d; //140+30+40+50=260
		c=a+b+c+d; //140+260+40+50=490
		d=a+b+c+d; //140+260+490+50=940
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
	}
}
