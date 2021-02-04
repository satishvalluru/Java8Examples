package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Product {

	int id;
	float price;
	String name;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		List<Product> product = new ArrayList<>();
		product.add(new Product(1, "oil", 100f));
		product.add(new Product(5, "Apple Laptop", 90000f));

		List<Float> productPriceList2 = product.stream().filter(p -> p.price > 30)// filtering data
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList2);

		List<List<Product>> producList = new ArrayList<>(); // list of list

		List<Product> product2 = new ArrayList<>();
		product2.add(new Product(4, "banana", 200f));
		product2.add(new Product(6, "Apples", 1000f));

		producList.add(product);
		producList.add(product2);

		System.out.println(producList);
		producList.stream().forEach(p -> {
			System.out.println(p.get(1));

		});

		List<Product> productPriceList1 = producList.stream().flatMap(p -> p.stream()).collect(Collectors.toList());
		System.out.println(productPriceList1);
		productPriceList1.stream().forEach(p -> {
			System.out.println(p.name);
			

		});

	}

}
