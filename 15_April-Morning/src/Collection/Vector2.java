package Collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector2 {
public static void main(String[] args) {
	
	Vector o1=new Vector();
	
	o1.add("Eren Yeager");
	o1.add(100);
	o1.add('X');
	o1.add(99.99999f);
	o1.add(100);
	o1.add(null);
	o1.add(null);
	
	System.out.println(o1);
	
	System.out.println(o1.isEmpty());
	System.out.println(o1.size());
	System.out.println(o1.contains(99.99999f));
    o1.add(5,100);
    System.out.println(o1);
    o1.remove(5);
    System.out.println(o1);
    o1.set(3, 88.888f);
    System.out.println(o1);
    System.out.println(o1.indexOf(88.888f));
    System.out.println(o1.get(3));
    
    System.out.println("---------For Each Loop--------");
    for(Object s1:o1)
    {
    	System.out.println(s1);
    }
    
    
    System.out.println("----------Iterator cursor-----------");
    Iterator itr=o1.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
    
    System.out.println("-------------List Iterator------------");
	ListIterator Ltr=o1.listIterator();
	while(Ltr.hasNext())
	{
		System.out.println(Ltr.next());
	}
}
}