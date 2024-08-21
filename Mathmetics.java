/*
1
-----------
Write a Java program to check whether a number is a Harshad Number or not.
In recreational mathematics, a harshad number in a given number base, is an integer that is divisible
by the sum of its digits when written in that base.Example: Number 200 is a Harshad Number because the 
sum of digits 2 and 0 and 0 is 2(2+0+0) and 200 is divisible by 2. 
Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1) and 171 is divisible by 9.
Create a Class HarsadNumber (BLC)
methods:

Method name: getSum()
Parameter: int
Modifiers: public, static
return type: int
Logic: This methods returns the sum of each digit.

Method name: checkHarsad()
Parameter: int
Modifiers: public, static
return type: void
Logic: This checks and prints the number is harsad number or not a harsad number.

Create a ELC class named TestHarsadNumber, take main method and test the code by taking the input from user.
Expected Output

Input a number : 353

353 is not a Harshad Number.
*/
package jlab;
import java.util.*;
public class Mathmetics {
	static int sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int theSum =getSumof(num);
		if(checkHarsad(theSum,num)) {
			//char x = (char)65535;
			System.out.println(num+" is harashed  "+theSum+" "+checkHarsad(theSum,num));
//			System.out.println(x+"");
		}else System.out.println(num+" is not harashed"+theSum+" "+checkHarsad(theSum,num));
	}

	public static boolean checkHarsad(int theSum, int num) {
		boolean f;
		if(theSum % num==0) {
			f=true;
		}
		else f=false;
		return f;
	}

	public static int getSumof(int n) {
		int t = n;
		while(t!=0) {
			int r = t%10;
			sum +=r;
			t=t/10;
		}
		return sum;
	}

}
