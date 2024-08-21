/*
 * Write a Java program to create the first twenty Hamming numbers.
In computer science, regular numbers are often called Hamming numbers, 
Hamming Numbers are numbers whose only prime factors are 2, 3 and 5.
The first few hamming numbers are :
1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18, 20, 24, 25, 27, 30, 32
Create a class HammingNumber

Method name: isPrime()
Parameter: int
Modifiers: public, static
return type: boolean
Logic: This method return boolean value based on number is prime or not.

Method name: checkHamming()
Parameter: -
Modifiers: public, static
return type: void
Logic: This method finds the factorials and checks the factorials are prime or not by calling isPrime(),
then if the only prime factors are 2,3,5 then Prints first 20 hamming Numbers.

Create a ELC class named TesthammingNumber, take main method and test the code.


Expected Output
First Twenty Hamming numbers: 1 2 3 4 5 6 8 9 10 12 15 16 18 20 24 25 27 30 32 36
to create effective algor:                                      
1
2
3
2 2 = 4/4
5
2 3 = 5/6
3 3 = 6/9
5 5 = 10/25
2 2 2 = 6/8
2 3 5 = 10/30
--------------------
for 1 to 50;
to check weather 2 == even 
for 3 == sum of digits divisble by 3
for 5 == ends with 0 || 5;
--------------------------
1==2^0 
2==2^1 
3==3^1
 4 5 6 8 9 10 12 15 16 18 20 24 25 27 30 32 36
 */
package jlab;

import java.util.*;
public class Hamm {
static int i=0,num;

	public static int Ham() {
	  while(true) {
		
			i++;
			
			int t=i;
			
			num = Div(2,t);
			
			num = Div(3,num);
			
			num = Div(5,num);   
			
			if(num ==1)return i;
			
	  }
		
	}

	public static int Div(int j, int i) {
		
		while(i%j==0) 
		
		{
		
			i = i/j;
		
		}
		
		return i;
	
	}

	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		int x= s.nextInt();
		
		while(x!=0) {
		
			System.out.print(" "+Ham());;
			
			x--;
		}
	}

}
