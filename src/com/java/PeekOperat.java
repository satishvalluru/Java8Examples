package com.java;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekOperat {
	
	public static void main(String[] args) {
		
		Stream.of("three", "two", "three", "four").filter(e -> e.length() > 3)
		  .peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
		  .peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
	}

}
