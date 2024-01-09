package Reverse_String;

public class Test4 {

	
	   public static void main(String[] args) {
		
		   String name="OMKAR";
		   
		   String yessir="";
				   
				   for(int i=name.length()-1; i>=0; i--)
				   {
					   yessir=yessir+name.charAt(i);
				   }
				   System.out.println(yessir);
	}
}
