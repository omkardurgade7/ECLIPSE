package ControlStatements;

public class nestedIF {

public static void main(String[] args)
{
	
	String UN="abc";
	String PSW="xyz";
	
	if("abc"==UN)  //abc==abc-->true
	{
		System.out.println("correct UN");
	
	if("xyz"==PSW)  //xyz==xyz-->true
		{
			System.out.println("correct password");
		}
		else
		{
			System.out.println("wrong password: Login Failed");
		}
	}
		else
		{
			System.out.println("wrong IN:Login Failed");
		}
	
}
}
