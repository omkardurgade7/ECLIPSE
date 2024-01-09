package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	
	public static void  main(String[]args) {
	
	LinkedList l1=new LinkedList();
	
	l1.add("Rohit");
	l1.add(100);
	l1.add('A');
	l1.add(77.9999f);
	l1.add(100);
	l1.add(null);
	l1.add(null);
	
	System.out.println(l1);
	
	System.out.println(l1.isEmpty());
	System.out.println(l1.size());
	System.out.println(l1.contains("Rohit"));
	l1.add(4, 400);
	System.out.println(l1);
	l1.remove(4);
	System.out.println(l1);
	System.out.println(l1.indexOf(null));
	System.out.println(l1.get(3));
	l1.set(3, 99.999f);
	System.out.println(l1);
	
	System.out.println("------------For each Loop-----------");
	
	for(Object d1:l1)
	{
		System.out.println(d1);
	}
	
	System.out.println("-------------Iterator Cursor------------");
	Iterator itr=l1.iterator();
	while(itr.hasNext())
	{
	System.out.println(itr.next());	
	}
	
	System.out.println("--------------List Iterator-------------");
	
	ListIterator p1=l1.listIterator();
	while(p1.hasNext())
	{
		System.out.println(p1.next());
	}
	}
}
