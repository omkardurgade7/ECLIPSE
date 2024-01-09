package Pallendrone;

public class Test6 {

	
	   public static void main(String[] args) {
		
		   String name="NITIN";
		   String which="";
		   
		   for(int i="NITIN".length()-1; i>=0; i--)
		   {
			   which=which+"NITIN".charAt(i);
		   }
		   if(name.equals(which))
		   {
			   System.out.println("String is pallendrone");
		   }
		   else
		   {
			   System.out.println("String is not pallendrone");
		   }
	}
}
