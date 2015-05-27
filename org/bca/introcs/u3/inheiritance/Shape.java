package org.bca.introcs.u3.inheiritance;

public abstract class Shape {
	protected String name; // now children of can see it
	
	public Shape(String name){
		this.name = name;
	}
	
	public abstract double getArea(); //abstract shows that it is there
	
	public abstract void move(double dx, double dy);

}
