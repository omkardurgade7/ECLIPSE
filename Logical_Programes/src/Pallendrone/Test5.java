package Pallendrone;

public class Test5 {

	
	
	   public static void main(String[] args) {  
	 int n=12321;
	 int r=0;
	 int sum=0;
	 int temp=0;
	 
	 temp=n;
	 while(n>0) {
		 r=n%10;
	 sum=(sum*10)+r;
	 n=n/10;
	 }
	   if(temp==sum)
	   {
		   System.out.println("Given number is pallendrome");
	   }
	   else
	   {
		   System.out.println("given number is not pallendrone");
	   }
	   }}

/*
String name="AVA";
String which="";

for(int i=name.length()-1; i>=0; i--)
{
	   which=which+name.charAt(i);
	   if(name.equals(which))
	   {
		   System.out.println("String is pallendrone");
	   }
}
}
}
*/