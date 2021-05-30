package com.claudemir.generics;

/**
 * 
 * @author gpnet
 *
 * @param <T>
 * 
 *  E - Element (used extensively by the Java Collections Framework)
	K - Key
	N - Number
	T - Type
	V - Value
	S,U,V etc. - 2nd, 3rd, 4th types
 */

public class Box<T> {
	T type;

	public T get() {
		return type;
	}

	public void set(T type) {
		this.type = type;
	}
	
}
