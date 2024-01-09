package Pallendrone;

public class Pallendrone_4 {

	
	     public static void main(String[] args) {
			
	    	String value="123321";
	    	
	    	String zz="";
	    	
	    	for(int x=value.length()-1; x>=0; x--)
	    	{
	    		zz=zz+value.charAt(x);
	    	}
	    	if(value.equals(zz))
	    	{
	    		System.out.println("Given no is pallendrone");
	    	}
	    	else
	    	{
	    		System.out.println("Given no is not pallendrone");
	    	}
		}
}
