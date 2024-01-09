package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList2 {

	public static void main(String[] args) {
		
		LinkedList k1=new LinkedList();
		
		k1.add("Heisenberg");
		k1.add(100);;
		k1.add('A');
		k1.add(33.33333f);
		k1.add(100);
		k1.add(500);
		k1.add(null);
		
		System.out.println(k1);
		System.out.println(k1.size());
		System.out.println(k1.isEmpty());
		System.out.println(k1.contains(33.33333f));
		k1.add(1, "Jesse");
		System.out.println(k1);
		k1.remove(2);
		System.out.println(k1);
		k1.set(2, 'B');
		System.out.println(k1);
		System.out.println(k1.indexOf(33.33333f));
		System.out.println(k1.get(6));
		
		System.out.println("+++++++++++For Each Loop+++++++++++");
		for(Object p1:k1)
		{
			System.out.println(p1);
		}
		
		System.out.println("+++++++++++++Iterator Cursor+++++++++++++");
		Iterator j1=k1.iterator();
		while(j1.hasNext())
		{
			System.out.println(j1.next());
		}
		
		System.out.println("++++++++++++List Iterator++++++++++++");
		ListIterator h1=k1.listIterator();
				while(h1.hasNext())
				{
					System.out.println(h1.next());
				}
		
		
		
		
	}
}
