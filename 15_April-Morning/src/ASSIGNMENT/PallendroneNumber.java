package ASSIGNMENT;

public class PallendroneNumber {

	
	       public static void main(String[] args) {
			
	    	   String num="";
	    	   
	    	   for(int t="123321".length()-1; t>=0; t--)
	    	   {
	    		   num=num+"123321".charAt(t);
	    	   }
	    	   if("123321".equals(num))
	    	   {
	    		   System.out.println("Number is pallendrone");
	    	   }
	    	   else
	    	   {
	    		   System.out.println("Number is not pallendrone");
	    	   }
		}
}
