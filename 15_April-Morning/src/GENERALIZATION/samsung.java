package GENERALIZATION;

public class samsung implements phone {

	
	public void name()
	{
		System.out.println("Samsung galaxy s23 ultra");
	}
	
	public void memory()
	{
		System.out.println("256 GB");
	}
	
	public void os()
	{
		System.out.println("Android 13");
	}
	
	public void price()
	{
		System.out.println("1,23,000");
	}
	
	public static void main(String[] args) {
		
		samsung u1=new samsung();
		
		u1.name();
		u1.memory();
		u1.os();
		u1.price();
	}
}
