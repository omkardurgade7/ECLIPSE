package ASSIGNMENT;

public class RevStrinng1 {
           
	
	public static void main(String[] args) {
		
		String space="";
		
		for(int e="BYEBYE".length()-1; e>=0; e--)
		{
			space=space+"BYEBYE".charAt(e);
		}
		System.out.println(space);
	}
}
