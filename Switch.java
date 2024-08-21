package jlab;

public class Switch {

	public static void main(String[] args) {
		int a=0;
		switch(a) {
		case 2 : a+=1;
		case 1 : a+=2;
		case 0 : a+=3;
		case 3 : a+=1;
		default : a+=4;
		}
		System.out.print("a is "+a);
	}

}
