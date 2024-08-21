/*
Define a method which accepts 2 values as number and returns the prime numbers between the values.
Write the method with the following specifications:
Name of method: getPrimeNumbers()
Arguments: two arguments of type integers
Return Type: String

Specifications: The value returned by the method getPrimeNumbers() is determined by the following rules:
Value must not be negative. If yes, then return -1 as string.
1st value must not be greater than or equal to 2nd value. If yes, then return -2 as string.
Prime Numbers must be returned as one string with every value separated by single blank space.
 */

package jlab;

public class UniversalPrime {
	static int i;
	public static void main(String args[]) {
		
		if(getPrimes(3,10)) {
			System.out.print(" "+i);
		}
	}

	private static boolean getPrimes(int a, int b) {
		for( i=a;i<=b;i++) {
			double t =i;
			for(int j=2;j<t/2;j++) {
				if(i%j==0) {
					return false;
				}
			}return true;
			
		}
		return true;
	}
}
