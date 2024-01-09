package p4;

public class RevString {
public static void main(String[] args) {
	
   String asus="";
   
   for(int h="LEVEL".length()-1; h>=0; h--)
   {
	   asus=asus+"LEVEL".charAt(h);
   }
   
   System.out.println(asus);
}
}
