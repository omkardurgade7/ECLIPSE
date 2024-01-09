package ControlStatements;

public class ELSEEFCondition {
public static void main(String[] args) {
	
	int marks=65;
	
	if(marks>=65)
	{
		System.out.println("distinction");
	}
	else if(marks>=60)
	{System.out.println("first class");
	}
	else if(marks>=50)
	{
		System.out.println("second class");
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

