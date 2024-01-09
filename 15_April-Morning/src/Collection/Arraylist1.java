package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Arraylist1 {

	
	public static void main(String[] args) {
		
		ArrayList t1=new ArrayList();
		
		t1.add("INDIA");
		t1.add(1000);
		t1.add('A');
		t1.add('b');
		t1.add("WIPRO");
		t1.add(1000);
		
		System.out.println(t1);;
		
		System.out.println(t1.contains("WIPRO"));
		
	    System.out.println(t1.size());
	    
	    System.out.println(t1.get(4));
	    
	    System.out.println(t1.indexOf('A'));
	    
	    t1.add(3,100);
	    System.out.println(t1);
	    
	    t1.add(4,200);
	    System.out.println(t1);
	    
	    t1.add(5,300);
	    System.out.println(t1);
	    
	    t1.remove(5);
	    System.out.println(t1);
	    
	    t1.set(5, 'B');
	    System.out.println(t1);
	    
	    ////////For loop///////////
	    System.out.println("~~~~~For Loop~~~~~");
	    for(Object s1:t1)
	    {
	    	System.out.println(s1);
	    }
	    
	    //////////iterator cursor//////////
	    System.out.println("~~~~~~~Iterator Cursor~~~~~~~");
	    
	    Iterator itr=t1.iterator();
	   while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	   
	   /////////////List Iterator//////////
	  System.out.println("~~~~~~~~List Iterator Cursor~~~~~~~");
	   ListIterator ltr=t1.listIterator();
	  while(ltr.hasNext())
	   {
		   System.out.println(ltr.next());
	   }
	   
	  
	}
}
