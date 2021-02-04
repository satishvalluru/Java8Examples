package com.java;

import java.util.Comparator;
import java.util.stream.IntStream;

public class SortedStream {

	public static void main(String[] args) {

		// List<Integer> list = Arrays.asList(1, 4, 3, 6, 5, 7, 9, 0);
		int[] intarray = { 3, 5, 4, 2 };

		// list.stream().sorted(Comparator.reverseOrder()).forEach(s ->
		// System.out.println(s));

		// Arrays.stream(intarray).sorted(Comparator.reverseOrder()).forEach(s ->
		// System.out.println(s));
		
		IntStream.of(intarray).boxed().sorted(Comparator.reverseOrder()).forEach(p -> System.out.println(p));

	}
}
