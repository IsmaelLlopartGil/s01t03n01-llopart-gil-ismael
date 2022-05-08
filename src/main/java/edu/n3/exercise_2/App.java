package edu.n3.exercise_2;

import java.util.*;

public class App {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		System.out.println("Llista 1: " + list1);

		List<Integer> list2 = new ArrayList<>();
		ListIterator<Integer> iterator = list1.listIterator(list1.size());

		while (iterator.hasPrevious()) {
			list2.add(iterator.previous());
		}

		System.out.println("Llista 2: " + list2);
	}
}
