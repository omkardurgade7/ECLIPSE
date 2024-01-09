package Constructor;

public class Test3 {

	
	
	String name;
	int marks;
	
	Test3(String n1,int m1)
	{
		this.name=n1;
		this.marks=m1;
	System.out.println(n1);
	System.out.println(m1);
	}
	
	public static void main(String[] args) {
		
		Test2 s1=new Test2("Virat",99);
		
		Test2 k1=new Test2("Rohit",98);
	}
	
	
}
