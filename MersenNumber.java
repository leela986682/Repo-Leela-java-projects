/*
 * Write a program to check if a number is a Mersenne number or not.
In mathematics, a Mersenne number is a number that can be written in the form M(n) = 2^n − 1 for some integer n.
The first four Mersenne primes are 3, 7, 31, and 127
create a class MersenneNumber(BLC)
Method name: checkMersenne()
Parameter: int
Modifiers: public, static
return type: void
Logic: Check the number is a Mersenne number or not by following above explanation. If yes then print the number is Mersenne number,
else print Number is not Mersenne Number

Create a ELC class named TestMersenneNumber, take main method and test the code by taking the input from user.

Expected Output

Input a number: 127
127 is a Mersenne number

for(int i = 1;i<=5;i++) {
	for(int j = 1;j<=5;j++) {
		if(i<=j) {
			pf("i+j-1");
		}else {
			pf("0");
		}
	}
}
 */
package jlab;
import java.util.*;
public class MersenNumber {
	public static void main(String[] args) {
		System.out.println("Enter the limit for numbers :");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double num  = sc.nextInt();
		double c=1,n=1;
		while(c<num) {
//			while(n<x)
			{
				int MP = (int)Math.pow(2, n)-1;
				n++;
			if(isPrime(MP)) {
				System.out.print(" "+MP);
				c++;
			}
		}
	}

}

	public static boolean isPrime(int a) {
		if(a<2)return false;
		if(a==2 || a==3)return true;
		if(a>3) {
			for(int i=2;i<a/2;i++) {
				if(a%i==0)return false;
			}
		}
		return true;
	}
}
