package com.Task_02_05_22;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class SetMethodsDemo {
	public void removeMethod() {
		Set<Integer> removeData = new HashSet<Integer>();
		removeData.add(35);
		removeData.add(23);
		removeData.add(15);
		removeData.add(13);
		removeData.add(5);

		System.out.println("Given Data is :" + removeData);

		removeData.remove(23);
		removeData.remove(5);

		System.out.println("Data after removed : " + removeData);
	}

	public void removeAllMethod() {
		Set<Integer> removeAllData = new HashSet<Integer>();
		removeAllData.add(4);
		removeAllData.add(7);
		removeAllData.add(5);
		removeAllData.add(1);
		removeAllData.add(9);

		System.out.println("Given Data :" + removeAllData);

		Set<Integer> newdata = new HashSet<Integer>();

		newdata.add(5);
		newdata.add(1);

		System.out.println("New data :" + newdata);

		removeAllData.removeAll(newdata);
		System.out.println("Data After removing all :" + removeAllData);
	}

	public void retainAllMethod() {
		Set<String> retainAllData = new HashSet<String>();
		retainAllData.add("Kumar");
		retainAllData.add("Mithun");
		retainAllData.add("Chandru");
		retainAllData.add("Aadhi");
		retainAllData.add("Sarath");

		System.out.println("Given data :" + retainAllData);

		Set<String> newData = new HashSet<String>();

		newData.add("Aadhi");
		System.out.println("New data :" + newData);

		retainAllData.retainAll(newData);
		System.out.println("Data after retaining :" + retainAllData);
	}

	public void pollFirstLastMethod() {
		TreeSet<Integer> pollFirstData = new TreeSet<>();
		pollFirstData.add(5);
		pollFirstData.add(8);
		pollFirstData.add(1);
		pollFirstData.add(6);

		System.out.println("Given data :" + pollFirstData);

		// pollFirstData.pollFirst();
		System.out.println("After removing first element :" + pollFirstData);

		pollFirstData.pollLast();
		System.out.println("After removing last element :" + pollFirstData);
	}

	public void linkedList() {
		LinkedList<String> al = new LinkedList<>();
		al.add("kumar");
		al.add("sarmi");
		al.add("sharal");
		al.add("sarath");
		al.add("joe");
		al.add("mithun");
		al.add("vicky");
		al.add("charu");
		System.out.println("initial list: " + al);

		al.remove(1);
		System.out.println("remove index : " + al);

		al.remove("sharal");
		System.out.println("remove object: " + al);

		al.removeFirst();
		System.out.println("remove first :" + al);
		al.removeLast();
		System.out.println("remove last : " + al);
		al.removeFirstOccurrence("joe");
		System.out.println("remove fist occurence :" + al);
		al.removeLastOccurrence("mithun");
		System.out.println("remove last occurmece :" + al);
		al.removeAll(al);
		System.out.println("remove all" + al);
	}
}
