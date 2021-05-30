package com.claudemir.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Util {
	public static void main(String[] args) {
		//processStringList(Collections.<String>emptyList());
		process(null);
		List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfList(li));
	}
	
	/**
	 * @param lista
	 * @return
	 */
	public static double sumOfList(List<? extends Number> lista) {
		double s = 0.0;
		for(Number value : lista) {
			s += value.doubleValue();
		}
		return s;
		
	}
	
	public static void process(List<? extends Foo> list) {
		
		Optional<List<? extends Foo>> listFoo = Optional.ofNullable(list); 
		if(listFoo.isPresent()) {
			for(Foo fo : list) {
				fo.something();
			}
		}
	}
	
	static void processStringList(List<String> stringList) {
	    System.out.println(stringList.getClass().getCanonicalName());
	}
	
	static <T> List<T> emptyList() {
		List<T> listOne = Collections.emptyList();
		return listOne;
	}
	
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());

	}
	
	public <U extends Number> void inspect(U number) {
		System.out.println(number.getClass().getName());
	}
	
	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elemen) {
		int count = 0;
		for(T e : anArray) {
			if(e.compareTo(elemen) > 0) {
				count++;
			}
		}
		return count;
	}
	
	  public static <U> void outputBoxes(java.util.List<Box<U>> boxes) {
		    int counter = 0;
		    for (Box<U> box: boxes) {
		      U boxContents = box.get();
		      System.out.println("Box #" + counter + " contains [" +
		             boxContents.toString() + "]");
		      counter++;
		    }
		  }
	
	  public static <U> void addBox(U u, 
		      java.util.List<Box<U>> boxes) {
		    Box<U> box = new Box<>();
		    box.set(u);
		    boxes.add(box);
		  }
	
	static <T> T pick(T a1, T a2) {
		return a2;
	}
}
