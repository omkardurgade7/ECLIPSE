package ControlStatements;

public class ELSEIF1 {
public static void main(String[] args) {
	int marks=75;
	if(marks>=75)
	{
		System.out.println("First class dist.");
	}
	else if(marks<=74)
	{
		System.out.println("second class dist.");
	}
	else if(marks>=60)
	{
		System.out.println("Distinction");
	}
	else if(marks>=35)
	{
		System.out.println("pass");
	}
	else if(marks<35)
	{
		System.out.println("fail");
	}
}
}
