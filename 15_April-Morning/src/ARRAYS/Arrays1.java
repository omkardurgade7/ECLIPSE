package ARRAYS;

import java.util.Arrays;

public class Arrays1 {
	
	//sorting ascending orders
	public static void main(String[] args) {
		
		//step1: Array declarationS
		
		int[] number=new int[4];
		
		//stp2: Array initialization
		number[0]=30;
		number[1]=10;
		number[2]=40;
		number[3]=20;
		
		//Ascending order
		Arrays.sort(number);
		
		//step3: usage
		for(int i=0;  i<=number.length-1;  i++)
		{
			System.out.println(number[i]);
		}
	}
}
