package com.java;

import java.util.ArrayList;
import java.util.List;

public class FilterIterate {

	int id;
	float price;
	String name;

	public FilterIterate(int id, float price, String name) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		List<FilterIterate> list = new ArrayList<>();
		list.add(new FilterIterate(1, 100f, "laptop"));
		list.add(new FilterIterate(2, 200f, "bag"));
		
		list.stream().filter(product -> product.price == 200).forEach(product -> System.out.println(product.name));

	}

}
