package p6;

public class CharAppear {
     public static void main(String[] args) {
		
    	 String quote="LIFE IS ABOUT CREATING YOURSELF";
    	 
    	 char appear='E';
    	 
    	 int find=0;
    	 
    	 for(int i=0; i<quote.length(); i++)
    	 {
    		 if(quote.charAt(i)==appear)
    			 find++;	 
    	 }
    	 
    	 System.out.println("Character "+appear+" appear "+find+" times");
	}
}
