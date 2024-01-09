package Character_Appear;

public class Test5 {

	
	   public static void main(String[] args) {
		
		   
		   String name="REVERSE";
		   char which='E';
		   int how=0;
		   
		   for(int i=1; i<name.length(); i++)
		   {
			   if(name.charAt(i)==which)
				   how++;
		   }
		   System.out.println(which+" character appears "+how+" many times");
	}
}
