package White_Spaces;

public class Test2 {

	
	 // public static void main(String[] args) {
		
		 /* String s="mumbai pune chennai";
		  char which=' ';
		  int how=0;
		  
		  for(int i=0; i<s.length()-1; i++)
		  {
			  if(s.charAt(i)==which)
				  how++;
		  }
		  System.out.println("White Spaces : "+how);  */
	public static void main(String[] args) 
	{    
	       String s = "java selenium python";    
	       int count = 0;    
		 for(int i = 0; i < s.length(); i++)
	           {    
			if(s.charAt(i) != ' ')    
			   count++;    
		     }       
	 System.out.println("Number of characters in a string: "+count);    
			    }
	}

   
	

