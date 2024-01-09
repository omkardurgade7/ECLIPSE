package LogicalProgs;

public class Revstr {

	
	   public static void main(String[] args) {
		
		   String name="HEISENBERG";
		   String what="";
		   
		   for(int i=name.length()-1; i>=0; i--)
		   {
			  what+=name.charAt(i);
		   }
		   System.out.println(what);
	}
}
