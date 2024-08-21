package jlab;
import java.util.*;
public class Employee {

	private String name;
	
	private String  depart;
	
	private double sal;
	
	private boolean isActive;
	
	public void setter(String n,String dep,double sal,boolean active) {
		this.name=n;
		this.depart=dep;
		this.sal=sal;
		this.isActive=active;
	}
	
    public void getter() {
    	System.out.println("name is "+name);
    	System.out.println("dep is "+depart);
    	System.out.println("sal is "+sal);
    	System.out.println("Is Active "+isActive);
	}

	

}
