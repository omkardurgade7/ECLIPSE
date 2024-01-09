package LogicalProgs;

public class RevString6 {

	
	public static void main(String[] args) {
		
		String name="";
		int t;
		for(t="software Engineer".length()-1; t>=0; t--)
		{
			name=name+"Software Engineer".charAt(t);
		}
		System.out.println(name);
	}
}
