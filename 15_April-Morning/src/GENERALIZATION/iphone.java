package GENERALIZATION;

public class iphone implements phone {

	
	
	public void name()
	{
		System.out.println("iphone 14 pro max");
	}
	
	public void memory()
	{
		System.out.println("256 GB");
	}
	
	public void os()
	{
		System.out.println("iOS");
	}
	
	public void price()
	{
		System.out.println("1,50,000");
	}
public static void main(String[] args) {
	
	iphone p1=new iphone();
	
	p1.name();
	p1.memory();
	p1.os();
	p1.price();
}
}
