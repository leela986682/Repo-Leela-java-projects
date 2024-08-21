package jlab;

import java.util.*;

public class BatsMan{
	
	static String name;
	static int runs;
	int matches;
	
public static void main(String []args) {
	
	BatsMan obj = new BatsMan();
	
	Scanner sc = new Scanner(System.in);
	
	 name = sc.nextLine();
	 
	 runs = sc.nextInt();
	 
	 obj.matches = sc.nextInt();
	 
	SampleBat.getStatistic();
	
}
	
	
}