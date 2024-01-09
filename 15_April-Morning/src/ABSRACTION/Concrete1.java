package ABSRACTION;

public class Concrete1 extends Abstract1 {

	
	public void k3()
	{
		System.out.println("heyy");
	}
		public void k4()
		{
			System.out.println("hello");
		}
		
		public static void main(String[] args) {
			
			
			Concrete1 t1=new Concrete1();
			
			t1.k1();
			t1.k2();
			t1.k3();
			t1.k4();
		}
		
}
