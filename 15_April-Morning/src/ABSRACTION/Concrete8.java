package ABSRACTION;

public class Concrete8 extends Abstract8 {

	
	public void uae()
	{
		System.out.println("United arab emirates Currency: AED");
	}
	
	public void uk()
	{
		System.out.println("United Kingdom Currency: £");
	}
	
	public static void main(String[] args) {
		
		
		Concrete8 o1=new Concrete8();
		
		o1.india();
		o1.us();
		o1.japan();
		o1.uae();
		o1.uk();
		
		
	}
}
