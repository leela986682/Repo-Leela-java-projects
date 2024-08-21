/*You are required to create a Flipkart class that simulates a simple e-commerce shopping cart with 
specific focus on clothes and mobile purchases. The class should contain methods to add items to the cart, 
calculate prices with discounts, and print the bill. 

Below are the detailed requirements for the methods:

> clothes(String product, String companyName, String type, int quantity):
---------------------------------------------------------------------------
This method is responsible for adding clothes to the cart.

Parameters:
=============
> product: The name of the product (should be "clothes").
> companyName: The name of the company (should be "Nike" or "Reebok").
> type: The type of clothes (should be "T-shirt" or "shoes").
> quantity: The quantity of the clothes.

Verifications
---------------
If the type and companyName match the allowed values, 
> CompanyName should be only "Nike" and "Reebok"
> type should be only "clothe"

call buyNowforClothes(type, quantity) to calculate the total price 
and then call bill(product, companyName, type, quantity, price) to print the bill. Otherwise, print "This product is not available!!".


> mobile(String product, String companyName, int quantity):
------------------------------------------------------------------
This method is responsible for adding mobile phones to the cart.

Parameters:
-------------
> product: The name of the product (should be "mobile").
> companyName: The name of the company (should be "Apple" or "Samsung").
> quantity: The quantity of the mobile phones.

If the product and companyName match the allowed values, 
> product will be "phone"
> companyName will be "Apple" and "sumsung"

call buyNowforMobile(companyName, quantity) to calculate the total price and then call bill(product, companyName, companyName, quantity, price) to print the bill.
Otherwise, print "This product is not available!!".


> buyNowforClothes(String type, int quantity):
--------------------------------------------------------------------------------
This method calculates the total price for clothes with discounts.
Parameters:
type: The type of clothes ("T-shirt" or "shoes").
quantity: The quantity of the clothes.
Returns:
The total price after discount.
Discounts:
T-shirt: 10% off on Rs. 500 each.
Shoes: 5% off on Rs. 1000 each.


> buyNowforMobile(String companyName, int quantity):
--------------------------------------------------------------------------------
This method calculates the total price for mobile phones with discounts.
Parameters:
companyName: The name of the company ("Apple" or "Samsung").
quantity: The quantity of the mobile phones.
Returns:
The total price after discount.
Discounts:
Apple: 20% off on Rs. 40,000 each.
Samsung: 25% off on Rs. 30,000 each.

> bill(String product, String companyName, String type, int quantity, double price):
------------------------------------------------------------------------------------
This method prints the bill for the purchased product.
Parameters:
product: The name of the product.
companyName: The name of the company.
type: The type of the product.
quantity: The quantity of the product.
price: The total price after discount.

public static void main(String[] args):
--------------------------------------------------------------------------------------
This method is the entry point of the program.
It should create an object of the Flipkart class and test the functionality by 
calling the clothes and mobile methods with appropriate arguments.
 */
package jlab;
import java.util.*;
public class flipkart {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("CHOOSE category Clothes or Mobile :");
			String type = scan.nextLine();
			if(type.equalsIgnoreCase("Clothes")) {
				Clothes();
			}else if(type.equalsIgnoreCase("Mobiles")) {
				Mobiles();
			}else System.out.println("this program is only for clothes and mobiles");
		}
	}

	private static void Mobiles() {
		System.out.println("CHOOSE STORE APPLE or SAMSUNG :");
		try (Scanner scan = new Scanner(System.in)) {
			String brand = scan.nextLine();
			String iteam;
			if(brand.equalsIgnoreCase("APPLE")) {
				System.out.println("available products=> IPHONE 11 , 12 , 13, 14, 15, 15PLUS :");
				iteam = scan.nextLine();
			}
			else {
				System.out.println("available items=> SAMSUNG S21,S22,S23,S23-ULTRA,FLIP-Z:5,6,7-PLUS :");
				 iteam = scan.nextLine();
			}
			System.out.println("Quantity requried  :");
			int q = scan.nextInt();
			System.out.println("ADD THIS TO CART (Y/N):");
			//char c = scan.nextLine().charAt(0);
			scan.nextLine();
			String c = scan.nextLine();
			if(c.equalsIgnoreCase("y")) {
				buyItem(brand,iteam,q);
			}else {
				System.out.println("THANK YOU FOR SHOPPING");
			}
		}
	}

	private static void Clothes() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("CHOOSE STORE NIKE or REEBOK :");
			String brand = scan.nextLine();
			System.out.println("available items=> t-shirts or shoes :");
			String iteam = scan.nextLine();
			System.out.println("Quantity requried  :");
			int q = scan.nextInt();
			System.out.println("ADD THIS TO CART (Y/N):");
			//char c = scan.nextLine().charAt(0);
			scan.nextLine();
			 String c = scan.nextLine();
			if(c.equalsIgnoreCase("y")) {
				buyItem(brand,iteam,q);
			}else {
				System.out.println("THANK YOU FOR SHOPPING");
			}
		}
	}

	private static void buyItem(String a,String b,int c) {
		if(a.equalsIgnoreCase("APPLE")||a.equalsIgnoreCase("SAMSUNG")||a.equalsIgnoreCase("IPHONE")||a.equalsIgnoreCase("GALAXCY")) {
			if(a.equalsIgnoreCase("APPLE")||a.equalsIgnoreCase("IPHONE")) {
				System.out.println("----->you got an discount of 20%<-----");
				long price = 40000*c;
				double finalIs = price/5;
				System.err.println("--------------------------------------------------------------------");
				System.err.println("-----------------------------|YOUR BILL|----------------------------");
				System.err.println("\t----->BRAND IS APPLE<-----");
				System.err.println("\t----->MODEL IS"+b+"<-----");
				System.err.println("\t----->you got an discount of 20% on"+b+"<-----");
				System.err.println("\t----->TOTAL BILL AMOUNT WITH DISCOUNT IS:("+finalIs+")<-----");
				System.err.println("--------------------------------------------------------------------");
			}else {
				System.out.println("----->you got an discount of 25%<-----");
				long price = 40000*c;
				double finalIs = price/4;
				System.err.println("--------------------------------------------------------------------");
				System.err.println("-----------------------------|YOUR BILL|----------------------------");
				System.err.println("\t----->BRAND IS SAMSUNG<-----");
				System.err.println("\t----->MODEL IS"+b+"<-----");
				System.err.println("\t----->you got an discount of 25% on"+b+"<-----");
				System.err.println("\t----->TOTAL BILL AMOUNT WITH DISCOUNT IS:("+finalIs+")<-----");
				System.err.println("--------------------------------------------------------------------");
			}
		}else {
			if(b.equalsIgnoreCase("t-shirt")) {
			System.out.println("----->you got an discount of 10%<-----");
			long price = 500*c;
			double finalIs = price/10;
			System.err.println("--------------------------------------------------------------------");
			System.err.println("-----------------------------|YOUR BILL|----------------------------");
			System.err.println("\t----->BRAND IS "+a+"<-----");
			System.err.println("\t----->MODEL IS  "+b+"<-----");
			System.err.println("\t----->you got an discount of 10% on"+b+"<-----");
			System.err.println("\t----->TOTAL BILL AMOUNT WITH DISCOUNT IS:("+finalIs+")<-----");
			System.err.println("--------------------------------------------------------------------");
			
		}else {
			System.err.println("----->you got an discount of 25%<-----");
			long price = 1000*c;
			double finalIs = price/20;
			System.err.println("--------------------------------------------------------------------");
			System.err.println("-----------------------------|YOUR BILL|----------------------------");
			System.err.println("\t----->BRAND IS "+a+"<-----");
			System.err.println("\t----->MODEL IS"+b+"<-----");
			System.err.println("\t----->you got an discount of 5% on"+b+"<-----");
			System.err.println("\t----->TOTAL BILL AMOUNT WITH DISCOUNT IS:("+finalIs+")<-----");
			System.err.println("--------------------------------------------------------------------");
			
		}
		
	}

}
}
