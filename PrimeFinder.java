package jlab;
import java.util.*;
public class PrimeFinder {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	test(x);
	}

	private static void test(int x) {
		{
			int t=x;
			if(x<2) {System.out.print("is not a prime number"); }
			for(int i=2;i<t/2;i++) {
				int c=0;
				if(x%i==0) {
					c=1;
				}if(c==0) {
					System.out.print("is a prime number");
				}else System.out.print("is not a prime number");
			}
		}
//		return;
	}

}
