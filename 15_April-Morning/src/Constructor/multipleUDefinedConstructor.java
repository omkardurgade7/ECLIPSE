package Constructor;

public class multipleUDefinedConstructor {

	int x;
	int y;
	
	String Studentname;
	multipleUDefinedConstructor()
	{
		x=20;
		y=40;
	}
	multipleUDefinedConstructor(int a,int b)
	{
		x=a;
		y=b;
	}
	multipleUDefinedConstructor(String Sname)
	{
		Studentname=Sname;
	}
	public void addition()
	{int add1=x+y;
		System.out.println(add1);
	}
	public void m1()
	{
		System.out.println(Studentname);
	}
	public static void main(String[] args) {
		multipleUDefinedConstructor s1=new multipleUDefinedConstructor();
		s1.addition();
		
		multipleUDefinedConstructor s2=new multipleUDefinedConstructor(40,90);
		s2.addition();
		
		multipleUDefinedConstructor s3=new multipleUDefinedConstructor("Virat");
		s3.m1();
	}
	
}