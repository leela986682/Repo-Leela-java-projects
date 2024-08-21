package jlab;

import java.util.Scanner;

public class convertCharacter {

	public void convert(int a,char ch) {
		if(64<a && a<89) {
			ch = (char)(ch+32);
			System.err.println("lower case is "+ch);
		}else if(96<a && a<121) {
			ch = (char)(ch-32);
			System.err.println("upper case is "+ch);
		}else {
			System.err.println("only for upper and lower Alphabatic characters");
		}
	}

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("ENTER THE CHARACTER:");
			char ch = s.next().charAt(0);
			int a = (int)ch;
			new convertCharacter().convert(a,ch);
		}
	}

}
