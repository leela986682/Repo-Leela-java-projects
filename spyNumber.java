package jlab;
import java.util.Scanner;
public class spyNumber {
	static int sum=0;
	static int product=1;
	public static void add(int n) {
		sum +=n;
	}public static void mul(int n) {
		product *=n;
	}
	public static void sp(int n) {
		int t=n,r;
		while(t!=0) {
			r = t%10;
			add(r);
			mul(r);
			t=t/10;
		}
	}

	public static void main(String[] args) {
		System.out.println("enter the number : ");
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			//System.out.print(a);
			sp(a);
		}
		if(sum == product) {
			System.out.println("it is a Spy number");
		}else System.out.println("it is not a Spy number");
	}

}
