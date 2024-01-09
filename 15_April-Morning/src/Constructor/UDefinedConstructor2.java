package Constructor;

public class UDefinedConstructor2 {

	
	int age;
	
	UDefinedConstructor2()
	{
	age=23;	
	}
	public void k1()
	{
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
		UDefinedConstructor2 j1=new UDefinedConstructor2();
		
	    j1.k1();
	}
}
