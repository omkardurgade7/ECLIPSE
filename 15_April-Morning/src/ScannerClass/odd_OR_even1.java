package ScannerClass;

import java.util.Scanner;

public class odd_OR_even1 {

	
	  public static void main(String[] args) {
		
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter year");
		  int year=scan.nextInt();
		  
		  if(year%4==0)
		  {
			  System.out.println("year is leap");
		  }
		  else
		  {
			  System.out.println("Year is not leap");
		  }
	}
}
