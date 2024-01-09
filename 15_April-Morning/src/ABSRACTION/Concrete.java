package ABSRACTION;

public class Concrete extends Abstract{
 //concrete class
	
	//sub class
	
	//m1() m2() m3() m4()
	
	//complete method    we complete the incomplete method from abstract class

	public void m3()  //method declaration
	{
		System.out.println("Good Morning"); //method implementation
	}
	public void m4()  //method declaration
	{ 
		System.out.println("Good Afternoon");  //method implementation
	}
	
	
	public static void main(String[] args) {
		
		//create object of same class
		
		Concrete s3=new Concrete();
		
		s3.m1();
		s3.m2();
		s3.m3();
		s3.m4();
	}
}
