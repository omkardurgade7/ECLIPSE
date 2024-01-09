package VARIABLES;

public class LOCAL_VARIABLES2 {

	
	
	public void m1(int c) //non static with parameter
	{
		int a=20;
		System.out.println(a);
		
		int b=20;
		System.out.println(b);
		
		int sum=(a+b+c);
		System.out.println(sum);
	}
	public static void main(String[] args) {
	
		LOCAL_VARIABLES2 s1=new LOCAL_VARIABLES2();  //object creation
		s1.m1(40);
		
	}
}
