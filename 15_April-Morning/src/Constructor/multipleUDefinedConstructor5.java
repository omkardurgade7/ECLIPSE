package Constructor;

public class multipleUDefinedConstructor5 {

	int x;
	int y;
	String studentname;
	multipleUDefinedConstructor5()
	{
		x=20;
		y=20;
	}
	multipleUDefinedConstructor5(String name)
	{
		studentname=name;
	}
	multipleUDefinedConstructor5(int a,int  b)
	{
		x=a;
		y=b;
	}
	public void substraction()
	{
		int sub=x-y;
		System.out.println(sub);
	}
	public void addition()
	{
		int sum=x+y;
		System.out.println(sum);
	}
	public void m1()
	{
		System.out.println(studentname);
	}
	public static void main(String[] args) {
		multipleUDefinedConstructor5 s1=new multipleUDefinedConstructor5();
				s1.addition();
	multipleUDefinedConstructor5 s2=new multipleUDefinedConstructor5();
	s2.substraction();
	multipleUDefinedConstructor5 s3=new multipleUDefinedConstructor5("Virat");
				s3.m1();
	}
}
