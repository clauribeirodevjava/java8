package com.claudemir.java8;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class Foo {
	
	@Test
	public void givenNull_whenCreatesNullable_thenCorrect() {
	    String name = null;
	    Optional<String> opt = Optional.ofNullable(name);
	    assertFalse(opt.isPresent());
	}
	
	@Test
	public void givenOptional_whenIfPresentWorks_thenCorrect() {
		Optional<String> opt = Optional.of("baeldung");
		opt.ifPresent(name -> System.out.print(name));
	}
	
	@Test
	public void givenOptional_whenIsPresentWorks_thenCorrect() {
	    Optional<String> opt = Optional.of("Baeldung");
	    assertTrue(opt.isPresent());

	    opt = Optional.ofNullable(null);
	    assertFalse(opt.isPresent());
	}
	
	@Test
	public void whenCreatesEmptyOptional_thenCorrect() {
	    Optional<String> empty = Optional.empty();
	    assertFalse(empty.isPresent());
	}
	
	@Test
	public void givenNonNull_whenCreatesNullable_thenCorrect() {
	    String name = "baeldung";
	    Optional<String> opt = Optional.ofNullable(name);
	    assertTrue(opt.isPresent());
	}
	
	public void validateParameters(Integer param ) {
	    if (param == null) {
	        throw new NullPointerException("Null parameters are not allowed");
	    }
	}
	
	@Test
	public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
	    String name = "baeldung";
	    Optional<String> opt = Optional.of(name);
	    assertTrue(opt.isPresent());
	}

	@Test
	@DisplayName("Test assert NullPointerException")
	public void testGeneralException() {

	     NullPointerException exception = assertThrows(NullPointerException.class, () -> {
	            validateParameters(null);
	        });
	    //assertEquals("Null parameters are not allowed", exception.getMessage());
	}
	
	@Test
	public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
		String name = null;
	    NullPointerException exception = assertThrows(NullPointerException.class, () -> {
	    	Optional.of(name);
	    	
        });
	}
}
