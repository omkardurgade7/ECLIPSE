package ScannerClass;

import java.util.Scanner;

public class Odd_OR_even {

	   public static void main(String[] args) {
		
		   Scanner scan=new Scanner(System.in);
		   System.out.println("Enter Number");
		   
		   int num=scan.nextInt();
		   
		   if(num%2==0)
		   {
			   System.out.println("number is even");
		   }
		   else
		   {
			  System.out.println("Number is odd");
		   }
	}
}
