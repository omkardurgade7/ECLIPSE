package Character_Appear;

public class Test1 {

	
	   public static void main(String[] args) {
		
		   String name="MAXIMILLIAN";
		   char which='I';
		   int how=0;
		   
		   for(int i=0; i<name.length(); i++)
		   
			   if(name.charAt(i)==which)
				   how++;
			   {
				 System.out.println(which+" character appears "+how+" times");  
			   }  
	}
}
