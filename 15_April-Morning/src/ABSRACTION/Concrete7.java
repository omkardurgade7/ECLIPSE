package ABSRACTION;

public class Concrete7 extends Abstract7{

	
	public void m4()
	{
		System.out.println("****1");
	}
	
	public static void main(String[] args) {
		
		Concrete7 t1=new Concrete7();
		
		t1.m1();
		t1.m2();
		t1.m3();
		t1.m4();
	}
}
