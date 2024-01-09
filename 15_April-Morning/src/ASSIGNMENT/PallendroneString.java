package ASSIGNMENT;

public class PallendroneString {
         
	
	public static void main(String[] args) {
		
		String i="";
		
		for(int x="EXE".length()-1; x>=0; x--)
		{
			i=i+"EXE".charAt(x);
		}
		if("EXE".equals(i))
		{
			System.out.println("String is pallendrone");
		}
		else
		{
			System.out.println("String is not pallendrone");
		}
		
	}
}
