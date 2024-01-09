package Reverse_String;

public class Test7 {
	//reverse string 
	public static void main(String[]args)
	{

	String name="CRISTIANO";
	String okay="";

	for(int i=name.length()-1; i>=0; i--)
	{
	okay=okay+name.charAt(i);
	}
	System.out.println(okay);
	}
}
