/*
WAP to input unit price and quantity of a product. Calculate total cost, discount
20% if the total purchase is more than Rs20000 otherwise discount is 10%.
Also find the net price to be paid.
 */
package jlab;

import java.util.Scanner;

public class Cost {
     static double price;
     static int num;
     static double totalcost;
	public void totalCost() {
		if(price>20000) {
			System.out.println("The total cost is "+disCount(price*num,0.2));
		}else {
			System.out.println("The total cost is "+disCount(price*num,0.1));
		}
	}

	private double disCount(double price ,double i) {
		totalcost = (price*(i))/num;
		return (price-totalcost);
	}

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Price of unit :");
			price = s.nextDouble();
			System.out.println("number of units :");
			num = s.nextInt();
		}
		new Cost().totalCost();
	}

}
