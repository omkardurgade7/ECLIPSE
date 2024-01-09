package LogicalProgs;

public class Pallendrone4 {

	
	public static void main(String[] args) {
		
		//AVA
		String a="";
		
		for(int b="AVA".length()-1; b>=0; b--)
		{
			a=a+"AVA".charAt(b);
		}
		if("AVA".equals(a))
		{
			System.out.println("Give String is Pallendrone");
		}
		else
		{
			System.out.println("Given String is not pallendrone");
		}
	}
}
