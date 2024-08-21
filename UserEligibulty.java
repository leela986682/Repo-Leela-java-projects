/*
 * 
Create an ELC class UserTest:
In Main Method:

Create an instance of the User class.
Set the user's name, purchase amount, and membership status using setter methods.
Call the displayDiscount() method to display the user's details along with the calculated discount.
Call the getDiscount(User user) method to get the Discount object with discountPercentage, by passing User object.
Call the applyDiscount(Discount) method to display the final price after applying the discount.

Example Ouput:
User 1: Name: "Alice", Purchase Amount: 150, Membership Status: "Silver"
Discount: 15%
Final Price: 127.50

User 2: Name: "Bob", Purchase Amount: 600, Membership Status: "Gold"
Discount: 25
Final Price: 450.00

User 3: Name: "Charlie", Purchase Amount: $80, Membership Status: "Regular"
Discount: 5%
Final Price: 76.00
 */
package jlab;
import java.util.*;
public class UserEligibulty {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("\t\t User Eligibulity");
		{
			User us = new User();
			System.err.println("\t-->Enter User Name:");
			String Uname = sc.nextLine();
			System.err.println("\t-->Enter Purchase Amount:");
			double  Pamt = sc.nextDouble();
			sc.nextLine();
			System.err.println("\t-->Enter MemberShip Status:");
			String  Mship = sc.nextLine();
			us.SetDetails(Uname,Pamt,Mship);
			Discount ds = new Discount();
			ds.discount(Mship, Pamt);
			us.GetDetails();
		}
		
	}

}
