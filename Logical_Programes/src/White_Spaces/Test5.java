package White_Spaces;

public class Test5 {
	//count white spaces 

	public static void main(String[]args)
	{
	String name="java selenium automation";
	char which=' ';
	int how=0;

	for(int i=1; i<name.length(); i++)
	{
	if(name.charAt(i)==which)
	how++;
	{
	}
	}
	System.out.println("White spaces = "+how);
	}
}
