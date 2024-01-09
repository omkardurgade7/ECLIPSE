package p2;

public class CharAppear
{
      public static void main(String[] args)
      {
		
    	  String quote="WAKE UP TO REALITY";
    	  char which='E';
    	  int how=0;
    	  
    	  for(int i=0; i<quote.length(); i++)
    	  {
    		  if(quote.charAt(i) == which)
    			  how++;
    	  }
    	  System.out.println("Chracter "+which+" appears "+how+" times");
    	  
    	  
	}     
}
