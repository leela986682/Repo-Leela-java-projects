package jlab;
public class Arthmetic {
	static double a;
	static double b;
public static void main(String args[]) {
	new Arthmetic().add(a,b);
	new Arthmetic().sub(a,b);
	new Arthmetic().mul(a,b);
	new Arthmetic().div(a,b);
	new Arthmetic().mod(a,b);
	new Arthmetic().pow(a,b);
	
}

public  double pow(double a,double b) {
	// TODO Auto-generated method stub
	return Math.pow(a, b);
}

public double mod(double a,double b) {
	// TODO Auto-generated method stub
	return a%b;
}

public double div(double a,double b) {
	// TODO Auto-generated method stub
	return a/b;
}

public double mul(double a,double b) {
	// TODO Auto-generated method stub
	return a*b;
}

public double sub(double a,double b) {
	// TODO Auto-generated method stub
	return a-b;
}

public double add(double a,double b) {
	// TODO Auto-generated method stub
	return a+b;
}
}
