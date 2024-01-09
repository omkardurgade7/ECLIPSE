package Inheritance;
//sub class
public class singlelevelinheri2 extends  singlelevelinheri{

	public void ford()
	{
		System.out.println("Mustang");
	}
	
	public static void main(String[] args) {
		
		singlelevelinheri2 o1=new singlelevelinheri2();
		o1.tata();
		
		o1.lamborgini();
		
		o1.ford();
	}
	
}
