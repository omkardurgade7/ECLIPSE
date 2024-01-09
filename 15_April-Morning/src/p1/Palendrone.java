package p1;

public class Palendrone {

	
	public static void main(String[] args) {
		
	   String hh="";
	   
	   for(int f="DAD".length()-1; f>=0; f--)
	   {
		   hh=hh+"DAD".charAt(f);
	   }
	   if("DAD".equals(hh))
	   {
		   System.out.println("Given name is pallendrone");
	   }
	   else
	   {
		   System.out.println("Given name is not pallendrone");
	   }
	}
}
