package ABSRACTION;

public class Concrete6 extends Abstract6 {

	
	public void Russia()
	{
		System.out.println("Roscosmos");
	}
	
	public void japan() 
	{
		System.out.println("JAXA");
	}
	
	public static void main(String[] args) {
		
		
		Concrete6 space=new Concrete6();
		
		space.India();
		space.Unitedstates();
		space.Russia();
		space.japan();
	}
}
