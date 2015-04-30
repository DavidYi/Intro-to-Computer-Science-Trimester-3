package org.bca.introcs.u3.ex;

public class Fan {
	public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = " blue";

	public Fan(int speed, double radius, String color, boolean on) {
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}

	public String toString() {
		if (on) {
			return "Speed: " + speed + "; Color: " + color + "; Radius: "
					+ radius;
		}
		return "Color: " + color + "; Radius: " + radius + "; Fan is off";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static int getSlow() {
		return SLOW;
	}

	public static int getMedium() {
		return MEDIUM;
	}

	public static int getFast() {
		return FAST;
	}

}
