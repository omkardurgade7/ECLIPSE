package Reverse_String;

public class test14 
{
   public static void main(String[] args) {
	
	   String name="SELMON";
	   String okay="";
	   int a=1;
		   
		   for(int i=name.length()-a; i>=0; i--)
		   {
			   okay=okay+name.charAt(i);
			   
		   }
		   System.out.println(okay);
}
}
