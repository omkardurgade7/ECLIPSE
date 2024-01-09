package Pallendrone;

public class Test7 {

	//string is pallendrone or not

	public static void main(String[]args)
	{
	String name="NAYAN";
	String okay="";
	for(int i=name.length()-1; i>=0; i--)
	{
	okay=okay+name.charAt(i);
	}
	if(name.equals(okay))
	{
	System.out.println("String ia pallendrone");
	}
	else
	{
	System.out.println("String is not pallendrone");
	}
}
}
