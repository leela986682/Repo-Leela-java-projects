package jlab;

public class Grade_Cal {

	private int range;
	private int age;
	private String name;
	private char grade;
	
	public char GradeCal() {
		char ch;
		if(range>90)ch='A';
		else if(range>80)ch='B';
		else if(range>70)ch='C';
		else ch='F';
		return ch;
	}
	public void setter(String n,int a,int r) {
		this.name = n;
		this.age=a;
		this.range=r;
	}
    public void getter() {
		System.out.println("name is "+name);
		System.out.println("age is "+age);
		System.out.println("Grade is "+GradeCal());
	}
}
