package Reverse_String;

public class test10 
{
   public static void main(String[] args) {
	
	   String name="OMKAR";
	   
	   String okay="";
	   
	   for(int i=name.length()-1; i>=0; i--)
	   {
		   okay=okay+name.charAt(i);
		   
	   }
	   System.out.println(okay);
}
}
