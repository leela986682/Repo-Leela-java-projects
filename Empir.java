package jlab;
import java.util.*;
public class Empir {

	public static void main(String[] args) {
		//79;;97 need to be prime
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(checkPrime(x)) 
	{
			reverse(x);
		if(checkPrime(x)) {
			System.out.print("is a Empir number");
		   }
		}
	}

	public static void reverse(int x) {
		int t = x;
		int n=1;
		while(t!=0) {
			int r = t%10;
			 n= n*10+r;
			t=t/10;
		}
	}

	private static boolean checkPrime(int n) {
	{
		        int i=n-1,f=1;
		    while(i!=1){
		        if(n%i==0)f=0;//return 0;
		        i--;
		    }
		    if(f==1) return true;
		    else return false;
	}

}
}
