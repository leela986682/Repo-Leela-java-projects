package jlab;
import java.util.*;
public class CubeExm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		CubeOf(x);
	}

	public static void CubeOf(int x) {
		for(int i =1;i<x/2 ;i++) {
			int t = i;
			while(t*t*t==x) {
				System.out.print("Cube root is "+t);
				return;
			}
		}
		
	}

}
