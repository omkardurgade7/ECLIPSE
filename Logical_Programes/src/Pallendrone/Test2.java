package Pallendrone;

public class Test2 {

	
	   public static void main(String[] args) {
		
		   String x="";
		   
		   for(int i="NAYAN".length()-1; i>=0; i--)
		   {
			   x=x+"NAYAN".charAt(i);
		   }
		   if("NAYAN".equals(x))
		   {
			   System.out.println("String is pallendrone");
		   }
		   else
		   {
			   System.out.println("String is not pallendrone");
		   }
	}
}
