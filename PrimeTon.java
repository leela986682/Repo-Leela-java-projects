package jlab;
import java.util.*;
public class PrimeTon {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		{
			for(int i = 1 ; i < num;i++) 
			{checkPrime(i);}
		}
	}

	public static void checkPrime(int num) {
		int c =0;
		if(num<2) {return;}
		else if(num >= 2) {
			if(num == 2  || num==3 ) {System.out.printf(" "+num);return;}
			for(int i = 2 ; i <= num/2 ;i++) {
				c = 0;
				if(num%i==0) {
					c++;
					break;
				}
			}if(c==0) 
				{
				System.out.printf(" "+num);
				}
		}
	
		
	}
}
