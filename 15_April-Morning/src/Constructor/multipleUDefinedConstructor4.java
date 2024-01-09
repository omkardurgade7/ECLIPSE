package Constructor;

public class multipleUDefinedConstructor4 {	

	multipleUDefinedConstructor4()
	{
	this(10);
	}
	multipleUDefinedConstructor4(int a)
	{
		
		System.out.println(a);
		System.out.println("name");
	}
	public static void main(String[] args) {
		
		multipleUDefinedConstructor4 s1=new multipleUDefinedConstructor4();
	}
}
