package ASSIGNMENT;

public class Fibonacci {

	public static void main(String args[])  
	{    
	 int a=0;
	 int b=1;
	 int c;    
	 int i;
	 
	 for(i=2;i<=10; ++i)    
	 {    
	  c=a+b;   //0+1=1      
	  a=b;     //0
	  b=c;     //0
	  
	  System.out.print(" "+c);
	 }    
	}	
}
