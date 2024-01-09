package LogicalProgs;

public class Pallendrone {

	
	public static void main(String[] args) {
		
		String name="";
		for(int i="NITIN".length()-1; i>=0; i--)
		{
			name=name+"NITIN".charAt(i);
		}
		if("NITIN".equals(name))
		{
			System.out.println("Given name is pallendrone");
		}
		else
		{
			System.out.println("Given name is not pallendrone");
		}
	}
}
