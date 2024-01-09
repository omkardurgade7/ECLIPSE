package max_min_val_array;

public class test3 {
	//find min value from an array

	public static void main(String[]args)
	{
	int a[]={3487,4847,2029,46438,4758,34,133,556};
	int min=a[0];

	for(int i=1; i<a.length; i++)
	{
	if(a[i]<min)
	{
		min=a[i];
	}
	}
	System.out.println(min);
	}
}
