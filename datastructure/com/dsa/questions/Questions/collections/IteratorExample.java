package com.dsa.questions.Questions.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	
	public static void main(String[] args) {
		List<String> g8 = new ArrayList<>();
		g8.add("India");
		g8.add("US");
		g8.add("UK");
		g8.add("France");
		g8.add("China");
		g8.add("Australia");
		g8.add("Brazil");
		g8.add("Japan");
		Iterator<String> itr = g8.iterator();
		while (itr.hasNext()) {
			if (itr.next().equals("UK")) {
				itr.remove();
			}
		}
		 
	}

}
