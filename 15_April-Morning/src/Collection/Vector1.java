package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {
public static void main(String[] args) {
	
	Vector v1=new Vector();
	
	v1.add("Virat");
	v1.add(100);
	v1.add('A');
	v1.add(60.00f);
	v1.add(100);
	v1.add(null);
	v1.add(null);
	
	System.out.println(v1);
	
	//verify vector is empty
	System.out.println(v1.isEmpty());
	
	//size
	System.out.println(v1.size());
	
	//info present 
	System.out.println(v1.contains(100));
	
	//add info
	v1.add(3,200);
	System.out.println(v1);
	
	//remove info
	v1.remove(3);
	System.out.println(v1);
	
	//update info
	v1.set(3, 99.99f);
	System.out.println(v1);
	
	//find info by index
	System.out.println(v1.indexOf('A'));
	
	//for loop
	System.out.println("---------For Each Loop---------");
	for(Object k1:v1)
	{
		System.out.println(k1);
	}
	
	//using Iterator cursor
	System.out.println("---------Iterator Cursor---------");
	Iterator itr=v1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	//using List Iterator 
	System.out.println("---------List Iterator----------");
			ListIterator ltr=v1.listIterator();
			while(ltr.hasNext())
			{
				System.out.println(ltr.next());
			}
			
			System.out.println("----------Enumaeration-----------");
			Enumeration e1=v1.elements();
			while(e1.hasMoreElements())
			{
				System.out.println(e1.nextElement());
			}
	
}
}
