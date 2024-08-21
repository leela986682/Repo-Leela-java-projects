/*
Membership Benefits Based on Customer Spending with Discount Application:
You are tasked with creating a system to determine discounts for products based on the total purchase amount 
and membership status of a user. The system involves two classes: User and Discount.



class Discount (BLC):

Attributes (all are private):
discountPercentage (double) - The percentage of discount applied.

Methods:
getDiscountPercentage() - Returns the discount percentage.
getDiscount(User user) - A static method that takes a User object as a parameter and returns a Discount object. This method should initialize the discountPercentage attribute based on the user's purchaseAmount and membershipStatus.
Logic:
If the user’s membership status is "Regular":
If the purchase amount is less than 100, set the discount percentage to 5.0%.
If the purchase amount is between 100 and 500 (inclusive), set the discount percentage to 10.0%.
If the purchase amount is greater than 500, set the discount percentage to 15.0%.

If the user’s membership status is "Silver":
If the purchase amount is less than 100, set the discount percentage to 10.0%.
If the purchase amount is between 100 and 500 (inclusive), set the discount percentage to 15.0%.
If the purchase amount is greater than 500, set the discount percentage to 20.0%.

If the user’s membership status is "Gold":
If the purchase amount is less than 100, set the discount percentage to 15.0%.
If the purchase amount is between 100 and 500 (inclusive), set the discount percentage to 20.0%.
If the purchase amount is greater than 500, set the discount percentage to 25.0%.

 */
package jlab;

public class Discount {
	static int dis;
	static double fp;
public void discount(String s,double pamt) {
	
		if(s.equalsIgnoreCase("Regular")) {
			
			if(pamt<100) {
            	dis = 5;
			}else if(pamt<=500) {
				dis = 10;
			}else {
				dis = 15;
			}
			
		}else if(s.equalsIgnoreCase("Silver")) {
            

			if(pamt<100) {
				dis = 10;
			}else if(pamt<=500) {
				dis = 15;
			}else {
				dis = 20;
			}
			
			
		}else if(s.equalsIgnoreCase("gold")){

			if(pamt<100) {
				dis = 15;
			}else if(pamt<=500) {
				dis = 20;
			}else {
				dis = 25;
			}
            
			
		}
		double x = (dis/100);
		double y = (pamt*x);
	fp = pamt - y;
}
}

