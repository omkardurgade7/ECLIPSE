package RevString;

public class Rev_String {

	    public static void main(String[] args) {
			
	    	String name="AUTOMATION";
	    	String no="";
	    	
	    	for(int i=name.length()-1; i>=0; i--)
	    	{
	    		no=no+name.charAt(i);
	    	}
	    	
	    	System.out.println(no);
		}
}
