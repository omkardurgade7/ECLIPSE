package White_Spaces;

public class Test6 
{
	public static void main(String[] args) {
	
     String word="WAKE UP TO REALITY";
     char which=' ';
     int how=0;
     
     for(int i=1; i<word.length()-1; i++)
     
    	 if(word.charAt(i)==which)
    		 how++;
    	 {
    		 System.out.println(how);
    	 }   
}
	
	}