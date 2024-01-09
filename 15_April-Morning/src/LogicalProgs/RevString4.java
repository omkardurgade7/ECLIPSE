package LogicalProgs;

public class RevString4 {
	public static void main(String[]args)
	{

	String h="";

	for(int y="AUTOMATION".length()-1; y>=0; y--)
	{
	h=h+"AUTOTMATION".charAt(y);
	}
	System.out.println(h);
	}
}
