package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class Arraylist {

	private static final Iterator Itr = null;

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		
		a1.add("OMKAR");
		a1.add(100);
		a1.add('A');
		a1.add(76.18f);
		a1.add(100);
		a1.add(null);
		a1.add(null);
		
		//Verify array list 
		System.out.println(a1); 
		
		//verify Arraylist empty or not
		System.out.println(a1.isEmpty());
		
		//size
		System.out.println(a1.size());
		
		//verify info. contains or not
		System.out.println(a1.contains('A'));
		
		//add info
		a1.add(1,200);
		System.out.println(a1);
		
		//remove info
		a1.remove(1);
		System.out.println(a1);
		
		//update info.
		a1.set(3, 99.99f);
		System.out.println(a1);
		
		//find index by data
		System.out.println(a1.indexOf('A'));
		
		//find data by index 
		System.out.println(a1.get(3));
		
		//    FOR loop 
		System.out.println("---For Loop--");
		for(Object s1:a1)
		{
			System.out.println(s1);
		}
		
		//By using iterator cursor
		System.out.println("---Iterator cursor--");
		Iterator itr= a1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		///By using List iterator cursor
		System.out.println("---ListIterator Cursor--");
		ListIterator ltr1=a1.listIterator();
		
	   while(ltr1.hasNext())
		{
			System.out.println(ltr1.next());
		}
	
		
	}
}
