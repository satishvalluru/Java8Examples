package com.java;

import java.util.stream.Stream;

public class DistictOpera {

	public static void main(String[] args) {
		Stream<String> fruits = Stream.of("apple", "banana", "grapes", "apple", "mango", "banana");

		Stream fruits1 = fruits.distinct();

		fruits1.forEach(s -> System.out.println(s));

	}

}
