package com.Task_02_05_22;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class InsertionOrder {

	// HashSet doesn't maintain insertion order.
	public void HashSet() {
		HashSet<Integer> dataHashSet = new HashSet<>();
		dataHashSet.add(4);
		dataHashSet.add(2);
		dataHashSet.add(7);
		dataHashSet.add(1);
		dataHashSet.add(2);
		System.out.println("Given HashSet Elements :" + dataHashSet);
	}

	public void LinkedHashSet() {
		LinkedHashSet<Integer> dataLinkedHashSet = new LinkedHashSet<Integer>();
		dataLinkedHashSet.add(6);
		dataLinkedHashSet.add(4);
		dataLinkedHashSet.add(1);
		dataLinkedHashSet.add(9);
		dataLinkedHashSet.add(5);
		System.out.println("Given LikedHashSet Elements :" + dataLinkedHashSet);
	}

	public void TreeSet() {
		Set<Integer> dataTreeSet = new TreeSet<Integer>();
		dataTreeSet.add(4);
		dataTreeSet.add(9);
		dataTreeSet.add(22);
		dataTreeSet.add(56);
		dataTreeSet.add(38);
		System.out.println("Given TreeSet elements :" + dataTreeSet);
	}
}
