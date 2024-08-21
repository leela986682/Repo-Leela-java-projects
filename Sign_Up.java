package jlab;

import java.util.Scanner;

public class Sign_Up {
static String fname;
static String mname;
static String lname;
static String g;
static String cou;
static String db;
static long num;
	public void Su() {
		Face_book f = new Face_book();
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter your first name:");
		fname = sc.nextLine();
		System.err.println("Enter your middle name: || enter for skip;");
		mname = sc.nextLine();
		System.err.println("Enter your last name: || enter for skip;");
		lname = sc.nextLine();
		System.err.println("Select Gender :\n M/F");
		g = sc.nextLine();
		System.err.println("Nationality:");
		cou = sc.nextLine();
        if(!(cou.equalsIgnoreCase("india"))){
        	System.out.println("This application only for india");
        	return;
		}
		System.err.println("Date of Birth:");
		System.err.println("Format :- YYYY:MM:DD");
		db = sc.nextLine();
		String s = db.substring(0, 4);
		int y = Integer.parseInt(s);
		System.err.print(" "+y);
		if(y>=2007) {
			System.err.print("you are nibba");
			return;
		}
		System.err.println("Enter your Mobile Number(with out country code):");
		num = sc.nextLong();
		int t= (int)num;
		int c=0;
		while(t!=0) {
			c++;
			t/=10;
		}
		if(c!=10) {
			return;
		}
		System.err.println("Creat User Name:");
		sc.nextLine();
		f.uname = sc.nextLine();
		System.err.println("Creat Password:");
		f.pass = sc.nextLine();
	}

}
