package jlab;

import java.util.*;

public class Face_book {
static int c;
static String uname="u";
static String name;
static String pass="p";
static String passw;
	public static  void fb() {
		Scanner sc = new Scanner(System.in);
		System.err.println("==========================================================================================");//6*15
		
		System.err.println("==============================>   FACEBOOK WELCOMES YOU !  <==============================");
		System.err.println("                                ___________________________");
		System.err.println("                               | USER NAME                 |");
		
		System.err.print("                               |___________________________|");
		 name = sc.nextLine();
		if(!(uname.length()==1)){
			 if(!(name.equals(uname))){
				 System.err.println("Account not found please !");
				 System.err.println("\t\t please! Check the userid");
				 return;
				}
		}
		 
		System.err.println("                                ");
		
		System.err.println("                                ___________________________");
		System.err.println("                               | PASSWORD                  |");
		
		System.err.print("                               |___________________________|");
		 passw = sc.nextLine();
		 if(!(pass.length()==1)){
		 if(!(passw.equals(pass))){
			 System.err.println("Account not found please !");
			 System.err.println("\t\t please! Check the password");
			}
		 }
		System.err.println("==========================================================================================");
		
		System.out.println("\t\tAccount not found please !");
		System.out.println("\t\t please! Creat New Account");
		System.out.print("\t click 1 for Sign_in");
		System.out.println("\t click 2 for Sign_up");
		c = sc.nextInt();
	}
	public static void main(String[] args) {
		fb();
	if(c==1 || c==2) {
		if(c==1)new Sign_Up().Su();
		else if(c==2)new Sign_In().Si();
	}
	}
}
