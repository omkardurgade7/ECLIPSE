package THISndSUPER;

public class T2 extends T1 {

	
	int a=100;
	int b=200;
	
	public void m1()
	{
		int c=300;
		int d=400;
		System.out.println(this.a);
		System.out.println(this.b);
		
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(super.Company);
		
		System.out.println(super.Owner);
	}
	
	public static void main(String[] args) {
		
		T2 y1=new T2();
		
		y1.m1();
		
	}
}
