package com;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> items;

	private double totalCost;

	private List<Discount> discounts;

	public ShoppingCart() {
		items = new ArrayList<>();
		discounts = new ArrayList<>();
		this.totalCost=0;

	}
	
	public void addItem(Product product) {
		items.add(product);
		totalCost=totalCost+product.getPrice();
	}
	
	public void displayItems() {
		for(Product product:items) {
			//System.out.println(product);
			System.out.println(product.getPrice());
		}
	}
	public void displaydiscount() {
		
		
		for(Discount discount:discounts) {
			System.out.println(discount);
		}
	}
	public void addDiscount(Discount discount) {
		discounts.add(discount);

	}
	
	
	public double calculatedCost() {
		double discountedAmount=totalCost;
		
		for (Discount d:discounts) {
			discountedAmount=discountedAmount-d.calculateDiscount(discountedAmount)	;
		}
		
		return discountedAmount;
		
		
		
		
	
		
				
	}

}
