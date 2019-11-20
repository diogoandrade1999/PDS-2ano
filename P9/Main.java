package P9;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		VectorGeneric<String> v = new VectorGeneric<>();
		
		v.addElem("Hello");
		v.addElem("World");
		v.addElem("Person");
		v.addElem("PDS");
		v.addElem("Name");
		
		Iterator<String> it = v.iterator();
		ListIterator<String> listi1 = v.listiterator(0);
		ListIterator<String> listi2 = v.listiterator(3);
		
		System.out.println(v.getElem(1));
		System.out.println(v.totalElem());
		
		v.removeElem("World");
		
		System.out.println(v.totalElem());
		
		for(int i = 0; i < v.totalElem(); i++) {
			System.out.println(it.next());
		}
		
		for(int i = 0; i < v.totalElem(); i++) {
			System.out.println(listi2.previous());
		}
		
		it.remove();
	}

}
