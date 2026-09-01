package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterator_Methods {

	public static void main(String[] args) {
		List <Integer> a = new LinkedList <Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(a);
		
		// Iterator
		
		Iterator <Integer> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		i.remove();
		System.out.println(a);
		
	}

}
