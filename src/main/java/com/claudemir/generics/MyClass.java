package com.claudemir.generics;

public class MyClass<X> {
	X x;
	public static void main(String[] args) {
		new MyClass<Integer>("God is blessed");
		MyClass<Integer> myObject = new MyClass<>("God is Good");
	}
	
	<T>  MyClass(T t) {
		System.out.println("oia: "+t.toString());
	}
}
