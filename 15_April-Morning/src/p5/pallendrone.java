package p5;

public class pallendrone {
   public static void main(String[] args) {
	
	   
	   String name="";
	   int d;
	   for(d="LEVEL".length()-1; d>=0; d--)
	   {
		   name=name+"LEVEL".charAt(d);
	   }
	   if("LEVEL".equals(name))
	   {
		   System.out.println("String is pallendrone");
	   }
	   else
	   {
		   System.out.println("String is not pallendrone");
	   }
}
}
