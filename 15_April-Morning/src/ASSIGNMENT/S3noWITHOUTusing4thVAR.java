package ASSIGNMENT;

public class S3noWITHOUTusing4thVAR {

	//swapping 3 numbers without using third variable
	
	public static void main(String[] args) {
		
	int a=10;
	int b=20;
	int c=30;
	
	a=a+b+c;  //10+20+30=60
	b=a+b+c;  //60+20+30=110
	c=a+b+c;  //60+110+30=200
	
	System.out.println("A="+a);
	
	System.out.println("B="+b);
	
	System.out.println("C="+c);
		
	}
}
