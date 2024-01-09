package LogicalProgs;

public class Pallendrone5 {

	public static void main(String[]args)
	{
	String name="";

	for(int p1="MADAM".length()-1; p1>=0; p1--)
	{
	name=name+"MADAM".charAt(p1);
	}
	if("MADAM".equals(name))
	{
	System.out.println("Given String is pallendrone");
	}
	else
	{
	System.out.println("Given String is not pallendrone");
	}
	}
}
