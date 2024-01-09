package LogicalProgs;

public class Pallendrone2 {

	
	public static void main(String[]args)
	{
		String a="";

		for(int x="mom".length()-1; x>=0; x--)
		{
		a=a+"mom".charAt(x);
		}

		if("mom".equals(a))
		{
		System.out.println("String is pallendrone");
		}
		else
		{
		System.out.println("String is not pallendrone");
		}
		
		
	}
}
