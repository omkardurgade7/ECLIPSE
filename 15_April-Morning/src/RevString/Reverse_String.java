package RevString;

public class Reverse_String {
           public static void main(String[] args) {
			
        	   String name="OMKAR";
        	   String what="";
        	   
        	   for(int i=name.length()-1; i>=0; i--)
        	   {
        		   what=what+name.charAt(i);
        	   }
        	   System.out.println(what);
		}
	
	
	
}
