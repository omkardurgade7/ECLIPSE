package INTERFACE;

public class Implement implements Interface {

	
	//implementation class
	//final public static int a=10;
	//abstract public void m1();
	//abstract public void m2();
	
	public void m1()   //method declaration
	{
		System.out.println("Hi"); //method implementation
	}
	
	public void m2()  //method declaration
	{
		System.out.println("Hello");  //method implementation
	}
	
	
	
	public static void main(String[] args) {
		
		
		//call the methods
		Implement y1=new Implement();
		
		y1.m1();
		y1.m2();
	}
}
