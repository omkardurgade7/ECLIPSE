package Constructor;

public class DefaultConstructor 
{
//use1 initialization of an object
	//default constructor-->provided by compiler
	//test(){}
	public static void main(String[] args) 
	{
		//create an object of same class
		DefaultConstructor s1=new DefaultConstructor();
		
		//call the method
		s1.multipication();	
	}
	
	public void multipication()
	{	
	int a=20;
	int b=30;
	
	int sum=20*30; //600
	
System.out.println(sum);   //600
	}
	
}
