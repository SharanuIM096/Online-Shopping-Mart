package com;

public class Main {
	
	public static void main(String[] args) {
		
		Product product1= new Product("laptop", 1000.00, "elctronics");
		Product product2= new Product("Book", 20.00, "books");
		
		ShoppingCart cart=new ShoppingCart();
		cart.addItem(product1);
		cart.addItem(product2);
		
		Discount percentageDiscount= new PercentageDiscount("10% off", 10.00);
		
		cart.addDiscount(percentageDiscount);
//		
		double TotalCost=cart.calculatedCost();
		
		System.out.println(TotalCost);
		//cart.displayItems();
//	cart.displaydiscount();
		
		
	}

}
