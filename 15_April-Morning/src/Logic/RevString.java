package Logic;

public class RevString {

	
	   public static void main(String[] args) {
		
		   
		   String name="OMKAR";
		   String a="";
		   
		   for(int s=name.length()-1; s>=0; s--)
		   {
			   a=a+name.charAt(s);
		   }
		   System.out.println(a);
	
}
}