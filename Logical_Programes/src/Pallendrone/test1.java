package Pallendrone;

public class test1 {

	//MADAM is pallendrone or not

	public static void main(String[]args)
	{
	String name="MADAM";
	String okay="";

	for(int i=name.length()-1; i>=0; i--)
	{
	okay=okay+name.charAt(i);
	}
	if(name.equals(okay))
	{
	System.out.println("String is pallendrone");
	}
	else
	{
	System.out.println("String is not pallendrone");
	
	}
	}
}
