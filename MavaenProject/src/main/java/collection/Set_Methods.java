package collection;

import java.util.HashSet;
import java.util.Set;

public class Set_Methods {

	public static void main(String[] args) {
		Set <Integer> a = new HashSet <Integer> ();//Generic // create two set, wrapper class must be same, give different reference
		//Set s = new TreeSet(); // Non-Generic
		Set <Integer> b = new HashSet <Integer> ();
		a.add(10);
		a.add(20);
		a.add(30);
		b.add(5);
		b.add(10);
		b.add(15);
		b.add(20);
		System.out.println(a);
		System.out.println(b);
		
		b.addAll(a);
		System.out.println(b);
		
		System.out.println(a.size());
		System.out.println(b.isEmpty());
		
		System.out.println(a.contains(5));
		System.out.println(a.contains(10));
		
		System.out.println(b.containsAll(a));
		
		a.remove(10);
		System.out.println(a);
		
		b.removeAll(a);
		System.out.println(b);
		
		a.clear();
		System.out.println(a);
		
		
		
	}

}
