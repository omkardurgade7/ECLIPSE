package Constructor;

public class Test6 {

	
	String name;
	int age;
	
	Test6(String n1,int a1)
	{
	this.name=n1;
	this.age=a1;
	System.out.println(n1);
	System.out.println(a1);
	}
	
	public static void main(String[] args) {
		
		Test6 v1=new Test6("Itachi",21);
		
		
	}
}
