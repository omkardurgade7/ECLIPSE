package LogicalProgs;

public class RevString3 {

	public static void main(String[] args) {
		
		String z="";
		
		for(int x="JAVA".length()-1; x>=0; x--)
		{
			z=z+"JAVA".charAt(x);
		}
		System.out.println(z);
	}
}
