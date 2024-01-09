package Constructor;

public class UDefinedConstructor1 {

	String name;
	int age;
	
	UDefinedConstructor1()
	{
		name="Itachi";
		age=21;
	}
	
	public void m1()
	{
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		
		UDefinedConstructor1 s1=new UDefinedConstructor1();
		s1.m1();
	}
	
	
}
