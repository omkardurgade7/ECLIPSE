package Constructor;

public class multipleUDefinedConstructor6 {

	int a;
	int b;
	int c;
	String pname;
	
	multipleUDefinedConstructor6()
	{
		a=40;
		b=70;
		c=30;
		pname="Virat";
	}
	int x;
	int y;
	int z;
	multipleUDefinedConstructor6(int x,int y,int z)
	{

	}
	public void addition()
	{
		int sum=a+b+c;
		int sub=a-b;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(pname);
	}
	public void sub()
	{
		int subs=x+y+z;
		System.out.println(subs);
	}

	public static void main(String[] args) {
		multipleUDefinedConstructor6 h1=new multipleUDefinedConstructor6();
		h1.addition();
		
		multipleUDefinedConstructor6 h2=new multipleUDefinedConstructor6(20,30,50);
		h2.sub();
		}
}
