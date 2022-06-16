package com.Task_02_05_22;

public class Runner {
	public static void main(String[] args) {
		SetMethodsDemo oDemo = new SetMethodsDemo();
		System.out.println("-----Remove-----");
		oDemo.removeMethod();
		System.out.println("-----RemoveAll-----");
		oDemo.removeAllMethod();
		System.out.println("-----RetainAll-----");
		oDemo.retainAllMethod();
		System.out.println("-----PollFirt & PollLast-----");
		oDemo.pollFirstLastMethod();
		System.out.println();
		System.out.println("linked list");
		oDemo.linkedList();
	}
}
