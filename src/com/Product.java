package com;

public class Product {
	
	private String name;
	private double price;
	private String category;
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	public Product(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}

	

}
