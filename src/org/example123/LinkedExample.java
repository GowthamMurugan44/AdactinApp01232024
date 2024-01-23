package org.example123;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedExample {
	public static void main(String[] args) {
		Set s = new LinkedHashSet();
		s.add(10);
		s.add("gowtham");
		s.add('G');
		s.add(997669283l);
		s.add(0.12f);
		s.add(null);
		s.add(true);
		System.out.println(s);
		for (Object s1 : s) {
			System.out.println(s1);
		}
		
			int size = s.size();
			System.out.println(s);
			boolean contains = s.contains(true);
			System.out.println(contains);
			 
			Set s2= new LinkedHashSet();
			s2.add(25);
			s2.add("gowtham");
			
			s2.addAll(s);
			System.out.println(s2);
			s2.retainAll(s);
			System.out.println(s2);
			s2.removeAll(s);
			System.out.println(s2);
			
			
		}

}
