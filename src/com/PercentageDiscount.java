package com;

public class PercentageDiscount extends Discount{
	
   public PercentageDiscount (String discountName,double discountPercentage) {
	super(discountName,discountPercentage);
	   
   }

@Override
public Double calculateDiscount(double totalCost) {
	
	return  totalCost*(getDiscountPercentage()/100);
	
}
   
   
	

}
