package Reverse_String;

public class Test1 {

	
	
	   public static void main(String[] args) {
		
		   String name="String";
		   
		   String x="";
		   
		   for(int i=name.length()-1; i>=0; i--)
		   {
			   x=x+name.charAt(i);
		   }
		   System.out.println(x);
	}
}
