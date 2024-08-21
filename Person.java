package jlab;

public class Person {

	private int age;
	private String name;
	
	public void setDetails(int age,String name){
		this.age = age;
		this.name = name;
	}
	public int getDetails(){
		return age;
	}
	public void Show(){
		System.out.println("the name is :"+name);
		System.out.println("age is :"+age);
	}

}
