package ASSIGNMENT;

public class RevString {
     public static void main(String[] args) {
		
    	 String a="";
    	 String word="WELCOME";
    	 
    	 for(int q=word.length()-1; q>=0; q--)
    	 {
    		 a=a+word.charAt(q);
    	 }
    	 System.out.println(a);
	}
}
