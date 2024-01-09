package Character_Appear;

public class Test10 
{
	public static void main(String[]args)
	{
	String word="JAVA";
	char which='A';
	int how=0;
	for(int i=1; i<word.length(); i++)
	{
	if(word.charAt(i)==which)
	how++;
	{
	}
	}
	System.out.println(which+" caharcter appears "+how+" times");
	}
}
