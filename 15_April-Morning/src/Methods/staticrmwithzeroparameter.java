package Methods;

public class staticrmwithzeroparameter {

	
	
	public static void main(String[] args) {
		addition();		
		substraction();
addition(20,50);
substraction(100,20);
		//static regular method with zero paramerter
	}
	public static void addition()  //zero parameter
	{
		int a=10;
		int b=20;
	int sum=a+b;	
	System.out.println(sum);   //zero parameter
	}
	public static void substraction()
	{
		int a=20;
		int b=10;
		int sub=a-b;
		System.out.println(sub);	
		
	}
	//static regular method with parameter
	public static void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public static void substraction(int c, int d)
	{
		int sub=c-d;
		System.out.println(sub);
	}
}
