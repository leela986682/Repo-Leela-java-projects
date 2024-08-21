package jlab;

import java.util.*;

public class BankAccount {

	static Scanner sc = new Scanner(System.in);
	
	private static String BName;
	
	private static String CName;
	
	private static String BAdd;
	
	private static String BIFSC;
	
	private static long ACCnum;
	
	private static double CURRBal;
	
	public BankAccount() {
		
	}
	
    //public void setDetails(String bn,String cn,String ba,String bc,long acc,double bal) {
    	
		
	//}
    
   public void withDraw(long acc,double Amo) {
    	CURRBal = CURRBal+Amo;
    	System.out.println("Transaction Sucessful..!");
    	System.out.println("Available bal:"+CURRBal);
		
	}

public void deposit(long acc,double Amo) {
	CURRBal = CURRBal-Amo;
	System.out.println("Transaction Sucessful..!");
	System.out.println("Available bal:"+CURRBal);
	
}

public void CurrBal() {
	//CURRBal = CURRBal+Amo;
	//System.out.println("Transaction Sucessful..!");
	System.out.println("Available bal:"+CURRBal);
	
}

public void show() {
	
	
}

	public static void main(String[] args) {
		
		
		System.out.println("Enter the bank Name:");
	     BName = sc.nextLine();
		
		System.out.println("Enter the customer Name:");
		 CName = sc.nextLine();
		
		System.out.println("Enter the bank add:");
		 BAdd = sc.nextLine();
		
		System.out.println("Enter the bank code:");
		 BIFSC = sc.nextLine();
		
		System.out.println("Enter the Acc Number:");
		 ACCnum = sc.nextLong();
		
		System.out.println("Enter the bal:");
		 CURRBal = sc.nextDouble();
		
		System.out.println("Enter 1 for balance enquiry \nEnter 2 for withdraw \nEnter 3 for deposit \nEnter 4 for profile ");
		 int ch = sc.nextInt();
		 if(ch==2) {System.out.println("Enter the amount to withdraw:");int amo = sc.nextInt();new BankAccount().withDraw(ACCnum,amo);}
		 else if(ch==3) {System.out.println("Enter the amount to deposit:");int amo = sc.nextInt();new BankAccount().deposit(ACCnum,amo);}
		 else if(ch==1) {new BankAccount().CurrBal();}
		 else if(ch==4) {new BankAccount().show();}
		 else {System.out.println("INVALID INPUT");}
	}

}
