package ABSRACTION;

public class Concrete9 extends Abstract9 {

	
	public void dob()
	{
		System.out.println("Date of birth: 01/01/1999");
	}
	
	public void classs()
	{
		System.out.println("Class: 10th");
	}
	
	public static void main(String[] args) {
		
		Concrete9 m1=new Concrete9();
		
		m1.Sname();
		m1.rollno();
		m1.grade();
		m1.dob();
		m1.classs();
	}
	
}
