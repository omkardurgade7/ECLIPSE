package p5;

public class StarPattern {
   public static void main(String[] args) {
	
	   int a;
	   int b;
	   int c;
	
	   for(a=5; a>=1; a--)
	   {
		   for(b=5; b>a; b--) 
		   {
		   System.out.print("");
		   }
	   for(c=1; c<(a*2); c++)
	   {
		   System.out.print(" * ");
	   }
	   System.out.println();
}
}
}