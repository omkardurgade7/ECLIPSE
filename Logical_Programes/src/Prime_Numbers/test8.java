package Prime_Numbers;

public class test8 
{
    public static void main(String[] args) {
		
    	int num=8;
    	
    	for(int i=2; i<num/2; i++)
    	{
    		if(num%i==0)
    		{
    			System.out.println("prime");
    		}
    		
    		else
    		{
    			System.out.println("not prime");
    		}
    }
    	
	}
}
