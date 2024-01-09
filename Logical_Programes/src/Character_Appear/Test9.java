package Character_Appear;

public class Test9 
{
	public static void main(String[]args)
	{
	String word="GOOGLE";
	char which='O';
	int how=0;

	for(int i=1; i<word.length(); i++)
	{
	if(word.charAt(i)==which)
	how++;
	{ }
	}
	System.out.println(which+" character appears "+how+" times");
}}
