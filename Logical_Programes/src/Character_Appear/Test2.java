package Character_Appear;

public class Test2 {

	public static void main(String[] args)
	{ 
			  String s="nayan";
			  char which='a';
			  int how=0;
			  
			  for(int i=0; i<s.length(); i++) 
			  if(s.charAt(i)==which)
			     how++;
			  {
	System.out.println(which+" character appears "+how+" times");
			  }
	}

}
