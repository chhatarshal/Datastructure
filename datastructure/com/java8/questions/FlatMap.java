package com.java8.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FlatMap {
	
	
	public static void main(String[] args) {
		
	}
	
	public String getList() {
		List<Product> products = new ArrayList<>();
		String name = products.stream()
			    .filter(p -> p.getPrice().intValue() < 50)
			    .findFirst()
			    .flatMap(Product::getName)
			    .map(String::toUpperCase)
			    .orElse("NOT FOUND");
		return name;
	}
	
	// getName() return an Optional
	public Optional<String> getName() {
		String name = "";
	    return Optional.ofNullable(name);
	}

}

class Product {
	
	private String name;
	private Double price;
	public static Optional<String> getName(Product product) {
		//return this.name;
		return Optional.of(product.name);
	}
	public Double getPrice() {
		return this.price;
	}
}
