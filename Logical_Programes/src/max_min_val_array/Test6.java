package max_min_val_array;

public class Test6 
{
    public static void main(String[] args) {
		
    	int a[]= {5,8,6,4,2,53,1};
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
