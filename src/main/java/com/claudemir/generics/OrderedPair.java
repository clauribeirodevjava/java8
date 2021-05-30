package com.claudemir.generics;

public class OrderedPair<K, V> implements Pair<K,V> {
	
	
	
	public OrderedPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	private K key;
	private V value;

	public K getKey() {
		
		return this.key;
	}

	public V getValue() {
		
		return this.value;
	}

}
