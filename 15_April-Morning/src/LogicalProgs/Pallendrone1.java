package LogicalProgs;

public class Pallendrone1 {

	public static void main(String[]args)
	{
	String okay="";
	
	for(int y="NAYAN".length()-1; y>=0; y--)
	{
		okay=okay+"NAYAN".charAt(y);
	}
		if("NAYAN".equals(okay))
		{
			System.out.println("Given String is pallendrone");
		}
		else
		{
			System.out.println("Given String is Not Pallendrone");
		}
		
		
	}
}
