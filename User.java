/*
 * Classes:
class User (BLC):

Attributes (all are private):
userName (String) - The name of the user.
purchaseAmount (double) - The total amount spent by the user on a purchase.
membershipStatus (String) - The membership status of the user ("Regular", "Silver", "Gold").

Methods:
setUserName(String name): void - Sets the user's name.
setPurchaseAmount(double amount): void - Sets the total purchase amount.
setMembershipStatus(String status): void - Sets the membership status.
getUserName(): String - Returns the user's name.
getPurchaseAmount(): double - Returns the total purchase amount.
getMembershipStatus(): String - Returns the membership status.

displayDiscount(): void - Displays the user's name, purchase amount.

applyDiscount(Discount discount) - Calculates and prints the 
final price and discount  %, after applying the discount.
 */


package jlab;

public class User {
private String uname;
private double pamt;
private String mship;
	public void SetDetails(String n,double a,String m) {
		uname=n;
		pamt=a;
		mship=m;
	}
	public void GetDetails() {
		System.err.println(" "+uname);
		System.err.println(" "+pamt);
		System.err.println(" "+mship);
		System.err.println(" "+Discount.fp);
	}
}
