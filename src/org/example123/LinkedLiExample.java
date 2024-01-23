package org.example123;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLiExample {
	public static void main(String[] args) {
		List l = new LinkedList();
		l.add("gowtham");
		l.add(10);
		l.add('G');
		l.add(986598656l);
		l.add(0.12f);
		
		System.out.println(l);
		for (int i = 0; i <l.size(); i++) {
			Object ob = l.get(i);
			System.out.println(ob);
			
		}
		
		int size = l.size();
		System.out.println(size);
		
		int indexOf = l.indexOf(10);
		System.out.println(indexOf);
		
		boolean contains = l.contains(2);
			System.out.println(contains);
			
			l.remove(3);
			System.out.println(l);
			
			//l.clear();
			//System.out.println(l);

			l.set(1, 20);
			System.out.println(l);
			
			
			
	}

}
