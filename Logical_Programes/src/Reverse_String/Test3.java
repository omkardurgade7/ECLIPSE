package Reverse_String;

public class Test3 {

	
	   public static void main(String[] args) {
		
		   String s="dcba";
		   String okay="";
		   
		   for(int i=s.length()-1; i>=0; i--)
		   {
			   okay=okay+s.charAt(i);
		   }
		   System.out.println(okay);
	}
}
