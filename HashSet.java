package com.Task_02_05_22;

import java.util.Iterator;
import java.util.TreeSet;

public class HashSet {
	public static void main(String[] args) {
		java.util.HashSet<String> hSet = new java.util.HashSet<>();
		hSet.add("Kumar");
		hSet.add("Sharal");
		hSet.add("Sarmi");
		hSet.add("Sarath");
		System.out.println("Elements :" + hSet);

		Iterator<String> iterator = hSet.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}

		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(78);
		treeSet.add(23);

		treeSet.pollFirst();
		System.out.println(treeSet);

		treeSet.pollLast();
		System.out.println(treeSet);

		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);
		System.out.println("Lowest Value: " + set.pollFirst());
		System.out.println("Highest Value: " + set.pollLast());
	}
}
