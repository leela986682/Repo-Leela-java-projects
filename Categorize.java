/*
 * Write a Java program that categorizes integers between 1 and 10,000 as Abundant and Perfect number.
In number theory, an abundant number is a number for which the sum of its proper divisors is greater than the number itself.
Perfect number: In number system, a perfect number is a positive integer that is equal to the sum of its proper positive divisors, that is, the sum of its positive divisors excluding the number itself.
Example :
The first few abundant numbers are:
12, 18, 20, 24, 30, 36, 40, 42, 48, 54, 56, 60, 66, 70, 72, 78, 80, 84, 88, 90, 96, 100, 102,…
The integer 12 is the first abundant number. Its proper divisors are 1, 2, 3, 4 and 6 for a total of 16.
The first perfect number is 6. Its proper divisors are 1, 2, and 3, and 1 + 2 + 3 = 6.The next perfect number is 28 = 1 + 2 + 4 + 7 + 14. This is followed by the perfect numbers 496 and 8128.

Create below methods:
method name: getAbundantNumber()
parameters: int start, int end
modifiers: static, public
return type :String
Logic: This method returns all abundant numbers in a String format with single space as a separator.

method name: getPerfectNumber()
parameters: int start, int end
modifiers: static, public
return type :String
Logic: This method returns all perfect numbers in a String format with single space as a separator.
 */

package jlab;
import java.util.*;
public class Categorize{
	public static void main(String []args) {
		int a=12;
		int b=100;
		getperfextsum(a, b);
		System.out.println();
		getabundant(a, b);
	}

	private static void getabundant(int a, int b) {
		for(int i =a;i<=b;i++) {
			int sum =0;
			int n=i;
			for(int j =1;j<n;j++) {
				if(n%j==0) {
					sum+=j;
				}
			}if(sum > i) {
				System.out.print("  "+i);
			}
		}
	}

	private static void getperfextsum(int a, int b) {
		for(int i =1;i<=b;i++) {
			int sum =0;
			int n=i;
			for(int j =1;j<n;j++) {
				if(n%j==0) {
					sum+=j;
				}
			}if(sum == i) {
				System.out.print(" "+i);
			}
		}
		
	}
}