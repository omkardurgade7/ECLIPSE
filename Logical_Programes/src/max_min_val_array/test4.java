package max_min_val_array;

public class test4 {
	//find max value from an array
	public static void main(String[]args)
	{

	int a[]={27,34,28,29,16,25,22};
	int max=a[0];

	for(int i=1; i<a.length; i++)
	{
	if(a[i]>max)
	{
	max=a[i];
	}
	}
	System.out.println(max);
	}
}
