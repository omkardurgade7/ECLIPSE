package Constructor;

public class UDefinedConstructor {
//use 1 initialization of an object
//use2 initialization of nonstatic global variable	
	int a;
	int b;
	
	//step1 variable declaration
	UDefinedConstructor()   //user defined constructor
	{
	a=10;	
	b=20;
	}

	//step3 usage
	public void addition()
	{
		int sum=a+b;//30
		System.out.println(sum);//30
		
	}
	
	public static void main(String[] args) 
	{
		//create of an object of same class
		UDefinedConstructor s1=new UDefinedConstructor();
		//call the method
		s1.addition();
	}
}
