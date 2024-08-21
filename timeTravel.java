package jlab;
import java.util.*;
public class timeTravel {
//	static int hours;
//	static int minuites;
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("press: \n\t 1)hours to minuites \n\t 2)minuites to hours");
			int ch =s.nextInt();
			if(ch==1) 
			{ 
				System.out.println("Enter hours:");
				int hours = s.nextInt();
				toMinutes(hours);
				}
			else 
			{ 
				System.out.println("Enter minuites:");
				int minuites = s.nextInt();
				toHours(minuites);
				}
		}
		}

	public static void toHours(int minuites) {
		 int hours = minuites/60;
		 int minuites1 = minuites%60;
		 System.out.print(minuites+" minuites is "+hours+" hours "+minuites1+"minuites");
	}

	public static void toMinutes(int hours) {
		
		 int minuites = hours*60; 
			System.out.print(hours+" hours is "+minuites+"  minuites ");
	}
}
