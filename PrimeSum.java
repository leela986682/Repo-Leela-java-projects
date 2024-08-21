/*Write a method which can find the sum of the first n prime numbers. Prime numbers are numbers which have only 1 and the number itself as its factors.
2 is the only even prime number. 1 is neither prime nor composite.
Example: the 1st 5 prime numbers are 2,3,5,7,11 and sum is 28
Method Name : getPrimeSum
Method Description :Get the sum of the first n prime numbers and return its sum.
Argument : int n
Return Type : int
Ques
2
-------------

Ques
3
-----------
Define a method which accepts 2 values as number and returns the prime numbers between the values.
Write the method with the following specifications:
Name of method: getPrimeNumbers()
Arguments: two arguments of type integers
Return Type: String

Specifications: The value returned by the method getPrimeNumbers() is determined by the following rules:
Value must not be negative. If yes, then return -1 as string.
1st value must not be greater than or equal to 2nd value. If yes, then return -2 as string.
Prime Numbers must be returned as one string with every value separated by single blank space.
Ques
4
------------
Write a Java program to check whether a number is a Pronic or Heteromecic Number or not.
A pronic number is a number which is the product of two consecutive integers, that is, a number of the form n(n + 1).
The first few pronic numbers are:
0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462 … etc.
Expected Output
Input a number : 110
Pronic Number.

Create a method:
method name: isPronicNumber()
parameters: int num
modifiers: static, public
return type :boolean
Logic: This method returns Boolean result based on the number is pronic or not.

Expected Output
Input a number : 110
Pronic Number: true




Ques
5
-----------
Define a method which accepts 2 values as number and returns the even numbers between the 2 values.
Write the method with the following specifications
Name of method getEvenNumbers() // which accepts 2 integer values as arguments and return the even numbers between the range.
Arguments: Two arguments of type integer
Return Type: String value
Note: If the first argument value is greater than second value, generate even numbers from first value to second value. If the second value is less than first value, generate even numbers from second value to first.
Specifications: The value returned by the method getEvenNumbers() is determined by the following rules
Values must not be negative. If yes, then return -1 as string.
Value must not be 0 or same. If yes, then return -2 as string.
The values must be returned as a single string where each value is separated by a single blank space.
For Example:
Input: 10 20
Output: 10 12 14 16 18 20
Input: 20 10
Output: 10 12 14 16 18 20

Ques
6
------------
Write a Java program that categorizes integers between 1 and 10,000 as Abundant and Perfect number.
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
public class PrimeSum {
	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  int x = s.nextInt();
	  int sum=0;
	  for(int i=2;i<x;i++) {
		  checkprime(i);
	  }
	}
	public static void checkprime(int y) {
		int c=0;
		int i;
		for(i=2;i<y/2;i++) {
			if(y%i==0) {c++;break;}
			else c=0;
		}if(c==0) {
			System.out.print(""+i);
		}
	}
}
