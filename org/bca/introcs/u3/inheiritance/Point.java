package org.bca.introcs.u3.inheiritance;

public class Point {
	private double x, y;
	
	public Point(double x, double y){
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void move(double dx, double dy){
		x += dx;
		y += dy;
	}
	
	@Override
	//used to show that the method below is overriding something
	public String toString(){
		//The green triangle if used in eclipse shows that it is overiding
		return "(" + x + ", " + y + ")";
	}
	
	

}
