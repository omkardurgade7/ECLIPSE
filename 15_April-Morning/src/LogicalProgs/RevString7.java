package LogicalProgs;

public class RevString7 {
	public static void main(String[] args) {
		
	String okay="";

	for(int u="naruto".length()-1; u>=0; u--)
	{
	okay=okay+"naruto".charAt(u);
	}
	System.out.println(okay);
}
}