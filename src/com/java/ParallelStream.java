package com.java;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("apple", "bag", "banana", "grapes");

		list.stream().forEach(p -> System.out.println("streams----" + p));

		list.parallelStream().forEach(p -> System.out.println("parallel streams-----" + p));
		
		list.parallelStream().forEachOrdered(p -> System.out.println("parallel stream ordered----" + p));
	}

}
