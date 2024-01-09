package Constructor;

public class multipleUDefinedConstructor1 {

	
	int x;
	int y;
	String studentname;
	multipleUDefinedConstructor1()
	{
		x=40;
		y=60;
	}
	multipleUDefinedConstructor1(int a,int b)
	{
	x=a;
	y=b;
	}
	multipleUDefinedConstructor1(String sname)
	{
		studentname=sname;
	}
	
	public void addition()
	{
		int sum1=x+y;
		System.out.println(sum1);
	}
	public void m1()
	{
		System.out.println(studentname);
	}
	
	public static void main(String[] args) {
				
		
		multipleUDefinedConstructor1 s2=new multipleUDefinedConstructor1(20,30);
		s2.addition();
		
		multipleUDefinedConstructor1 s3=new multipleUDefinedConstructor1("Virat");
		s3.m1();
		
	}
}
