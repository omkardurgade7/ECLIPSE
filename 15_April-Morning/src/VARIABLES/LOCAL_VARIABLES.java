package VARIABLES;

// the variable which is declared inside of the method is called as local variables

public class LOCAL_VARIABLES {

	public static void m1(int c) {
	
		int a=10;
		System.out.println(a);
		
		int b=20;
		System.out.println(b);
		
		int sum=a+b+c;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		m1(30);
	}
	
}
