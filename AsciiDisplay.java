package jlab;
import java.util.*;
public class AsciiDisplay {
	public static void print_Chars(char a,char b,int n) {	int t=-1;
	
		for(int i='(';i<='z';i++) {
			++t;
			if(t==20) {System.out.println();t=0;}
			System.out.print((char)(i)+" ");
			
		}
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			char a = sc.next().charAt(0);
			char b = sc.next().charAt(0);
			print_Chars(a, b, 20);
		}

	}

}