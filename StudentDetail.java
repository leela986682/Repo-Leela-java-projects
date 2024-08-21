/*
 *StudentDetail sd = new StudentDetail();
	sd.checkPrime(num);
	 Write a java program to check the number is prime or not by creating the method and 
by checking the requirement 

Method name: checkPrime 
Method type: non static 
Method return type : Boolean 
Method parameter : one parameter of int type 

get the return result back to the calling place and based on the return result 
print the number is prime or not 

if true result back from the method "then the number is prime"
else " not prime".

 * 
 */

package jlab;
import java.util.Scanner;
public class StudentDetail {
boolean checkPrime(int x) {
	boolean f = false;
	for(int i=2;i<x/2;i++) {
		if((x%i)==0) {
			f=true;
		}
		
	}
	return f;
}
	public static void main(String[] args) {
	try (Scanner s = new Scanner(System.in)) {
		int num = s.nextInt();
		if(new StudentDetail().checkPrime(num)==false) {
			System.out.println("prime");
		}else System.out.println("not a prime");
	}
	}

}
