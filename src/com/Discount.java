package com;

public abstract class Discount {
	@Override
	public String toString() {
		return "Discount [discountName=" + discountName + ", discountPercentage=" + discountPercentage + "]";
	}



	public Discount(String discountName, double discountPercentage) {
		//super();
		this.discountName = discountName;
		this.discountPercentage = discountPercentage;
	}



	public String getDiscountName() {
		return discountName;
	}



	public double getDiscountPercentage() {
		return discountPercentage;
	}




	protected String discountName;
	protected double discountPercentage;
	
	
	public abstract Double calculateDiscount(double totalCost);

}
