package com.java;

import java.util.ArrayList;
import java.util.List;

public class ReduceStream {
	
	int id;
	float price;
	String name;
	
	public ReduceStream(int id, float price, String name) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		List<ReduceStream> list = new ArrayList<>();
		list.add(new ReduceStream(1, 100f, "laptop"));
		list.add(new ReduceStream(2, 200f, "bag"));
		
		float totalPrice = list.stream().map(product -> product.price).reduce(0.1f, (sum,price)->(sum+price));
		System.out.println(totalPrice);
		
		float totalprice2 = list.stream().map(product -> product.price).reduce(0.1f, Float::sum);
		System.out.println(totalprice2);
	}
}
