package Character_Appear;

public class Test17 
{
  public static void main(String[] args) {
	
	  String name="OGGY";
	  char which='G';
	  int how=0;
	  
	  for(int i=0; i<name.length(); i++)
	  
		  if(name.charAt(i)==which)
			  how++;
	  {
		  System.out.println(which+" appears "+how+" times");
	  }
}
}
