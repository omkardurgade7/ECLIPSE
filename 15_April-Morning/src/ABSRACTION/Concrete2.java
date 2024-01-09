package ABSRACTION;

public class Concrete2 extends Abstract2 {

	
	
	public void sim3()
	{
		System.out.println("VI");
	}
	
	public static void main(String[] args) {
		
		
		Concrete2 Network=new Concrete2();
		
		Network.sim1();
		Network.sim2();
		Network.sim3();
	}
}
