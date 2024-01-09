package LogicalProgs;

public class RevString1 {

	
	public static void main(String[] args) {
		
		String okay="";
		
		
		for(int i="jira".length()-1; i>=0; i--)
		{
			okay=okay+"jira".charAt(i);
		}
		System.out.println(okay);
		
	}
}
