package THISndSUPER;

public class CLASS2 extends CLASS1{

	
	int d=23827;
	int j=834748;
	
	public void numbers()
	{
		int k=98782834;
		System.out.println(k);
		System.out.println(this.d);
		System.out.println(this.j);
		
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(super.x);
		System.out.println(super.y);
	}
	
	public static void main(String[] args) {
		
		CLASS2 Digits=new CLASS2();
		
		Digits.numbers();
	}
}
