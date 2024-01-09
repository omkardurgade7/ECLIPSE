package POLYMORPHISM;

public class COMPILETIME {
//compiletime polymorphism : method overloading
	//method declaration + method definition/implementation=compile time
	
	public void m1()   //method declaration
	{
		System.out.println("Hi"); //method implimentation
	}
	public void m1(float z) //method declaration
	{
		System.out.println("hi"); //method implimentation
	}
	public void m1(int a)//method declaration
	{
		System.out.println("Hello");//method implimentation
	}
	public void m1(String name)//method declaration
	{
		System.out.println("Good Morning");//method implimentation
	}
	public void m1(char x)//method declaration
	{
		System.out.println("h");//method implimentation
	}
	public void mq(int z,int y)//method declaration
	{
		System.out.println("Hi");//method implimentation
	}
	
}
