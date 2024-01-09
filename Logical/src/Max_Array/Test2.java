package Max_Array;

import java.util.Arrays;

public class Test2 {

	   public static void main(String[] args) {
		   int[] a={2,3,1,3,4,5,6,60,40};
		   Arrays.sort(a);
		   int max = a[a.length-1];
		   System.out.println(max);
	}
}
