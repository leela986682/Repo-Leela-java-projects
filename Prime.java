package jlab;
import java.util.Scanner;
public class Prime{
    public static void pri(int n){
        int i=n-1,f=1;
    while(i!=1){
        if(n%i==0)f=0;//return 0;
        i--;
    }
    if(f==1)System.out.println("is prime");
    else System.out.println("is not prime");
}
    public  static void main(String args[]){
        try (Scanner s = new Scanner(System.in)) {
			int a = s.nextInt();
			 pri(a);
		}
     
    } 
}