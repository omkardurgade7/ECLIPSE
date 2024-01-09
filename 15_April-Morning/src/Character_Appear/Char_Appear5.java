package Character_Appear;

public class Char_Appear5 {
     public static void main(String[] args) {
		
    	 String word="ABBADABBAJABBA";
    	 char which='B';
    	 int how=0;
    	 
    	 for(int i=0; i<word.length(); i++)
    		 if(word.charAt(i)==which)
    			 how++;
    			 {
                   System.out.println(which+" Character appears "+how+" Times");
    			 }
	}
}
