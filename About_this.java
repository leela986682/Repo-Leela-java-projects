package jlab;

import java.io.OutputStream;
import java.io.PrintStream;

public class About_this {

	static int c =10;
	int a;
	int b;
	
	public About_this() {
	
	
	}

	public static void main(String[] args) {
	About_this obj = new About_this();
	About_this obj1 = new About_this();
	About_this obj2 = new About_this();
	About_this obj3 = new About_this();
	About_this obj4 = new About_this();
		obj.m1(obj4);
		obj1.m2(obj4);
		obj2.m3(obj4);
		obj3.m4(obj4);
	}

	public void m1(About_this obj) {
		this.a = 100;
		obj.b = 100;
		obj.c=3;
		System.out.println(" "+(a+b)+""+c);
		
	}
	public void m2(About_this obj) {
		//this.a = 100;
		//this.b = 100;
	//	obj.a=10;
		this.c=4;
		System.out.println(" "+(obj.a+obj.b)+""+c);
		
	}
	public void m3(About_this obj) {
//		this.a = 100;
//		this.b = 100;
		System.out.println(" "+(a+b)+""+c);
		
	}
	public void m4(About_this obj) {
//		this.a = 100;
//		this.b = 100;
		System.out.println(" "+(a+b));
		
	}

}
