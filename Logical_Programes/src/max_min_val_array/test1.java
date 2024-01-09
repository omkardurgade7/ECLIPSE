package max_min_val_array;

public class test1 
{

	
	public static void main(String[] args) {
		
		int a[]= {2,35,5774,3443,8885};
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
