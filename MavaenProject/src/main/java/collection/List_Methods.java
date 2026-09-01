package collection;

import java.util.LinkedList;
import java.util.List;

public class List_Methods {

	public static void main(String[] args) {
		List <Integer> a = new LinkedList <Integer>();
		//List a = new LinkedList();
		a.add(2);
		a.add(6);
		a.add(8);
		a.add(10);
		System.out.println(a);
		System.out.println(a.get(3));
		a.set(1,4); // (index position, new value)
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		a.remove(0); // Index position
		System.out.println(a);
		System.out.println(a.contains(8));
		System.out.println(a.contains(1));
		System.out.println(a.indexOf(10));
		a.add(10);
		System.out.println(a);
		System.out.println(a.lastIndexOf(10));
	}

}
