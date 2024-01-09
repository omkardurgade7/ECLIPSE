package RevString;

public class Rev_string1 {

	   public static void main(String[] args) {
		
		   String cc="MANUAL";
		   
		   String dd="";
		   
		   for(int i=cc.length()-1; i>=0; i--)
		   {
			   dd=dd+cc.charAt(i);
		   }
		   System.out.println(dd);
	}
}
