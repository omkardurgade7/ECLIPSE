package ScannerClass;

import java.util.Scanner;

public class Addition {
        
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Number1 : ");
		int num1=scan.nextInt();
		
		System.out.println("Enter Number2 : ");
		int num2=scan.nextInt();
		
		System.out.println(num1+num2);
	}
 }
