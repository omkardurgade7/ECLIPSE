package Character_Appear;

public class test16 {

	  public static void main(String[] args) {
		
		  String name="SUSHANT";
		  char which='S';
		  int how=0;
		  for(int i=0; i<name.length(); i++)
		  
			  if(name.charAt(i)==which)
				  how++;
			  {
				  System.out.println(which+" appears "+how+" times");
			  }
		  
	}
}
