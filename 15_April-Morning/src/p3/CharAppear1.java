package p3;

public class CharAppear1 {
     public static void main(String[] args) {
		
    	 String num="7385248317";
    	 char ch='8';
    	 int how=0;
    	 
    	 for(int i=0; i<num.length(); i++)
    	 {
    		 if(num.charAt(i)==ch)
    			 how++;
    	 }
    	 System.out.println("number "+ch+" appears "+how+" times");
	}
}
