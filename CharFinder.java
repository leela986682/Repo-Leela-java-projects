/*
WAP to input unit price and quantity of a product. Calculate total cost, discount
20% if the total purchase is more than Rs20000 otherwise discount is 10%.
Also find the net price to be paid.package jlab;
 */
package jlab;
import java.util.*;
public class CharFinder {

	public void Show() {
		
	}

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("ENTER THE CHARACTER:");
			char ch = s.next().charAt(0);
			int a = (int)ch;
			dora(a,ch);
			//System.out.println("ENTER THE CHARACTER:"+a);
		}
	}

	private static void dora(int a,char ch) {
		if(47<a && a<58) {
			System.out.println(ch+"is a numeric value");
		}else if(64<a && a<89) {
			System.out.println(ch+"is a Upper case");
		}else if(96<a && a<121) {
			System.out.println(ch+"is a Lower case");
		}else {
			System.out.println(ch+"is a Special character");
		}
		
	}

}
