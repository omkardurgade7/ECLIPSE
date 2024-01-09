package ARRAYS;

import java.util.Arrays;

public class Arrays2 {

	
	public static void main(String[] args) {
		
		char[] alphabets=new char[4];
		
		alphabets[0]='B';
		alphabets[1]='D';
		alphabets[2]='C';
		alphabets[3]='A';
		
		Arrays.sort(alphabets);
		
		for(int i=0; i<=alphabets.length-1;  i++)
		{
			System.out.println(alphabets[i]);
		}
	}
}
