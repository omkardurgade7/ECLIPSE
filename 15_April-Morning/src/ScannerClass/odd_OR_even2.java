package ScannerClass;

import java.util.Scanner;

public class odd_OR_even2 {

	   public static void main(String[] args) {
		
		   Scanner scan=new Scanner(System.in);
		   
		   System.out.println("Enter Number");
		   int number=scan.nextInt();
		   
		   if(number%2==0)
		   {
			   System.out.println("is even number");
		   }
		   else
		   {
			   System.out.println("is odd number");
		   }   
	}
}
