package max_min_val_array;

public class test5 {

	//fin min value from an array

	public static void main(String[]args)
	{
	int a[]={4,9,20,3,452,535,655};
	int min=a[0];

	for(int i=1; i<a.length; i++)
	{
	if(a[i]<min)
	{
	min=a[i];
	}
	}
	System.out.println("minimum value = "+min);
	}
}
