package org.bca.introcs.u3.ex;

public class FanTester {

	public static void main(String[] args) {
		Fan f1 = new Fan(Fan.FAST, 10, "yellow", true);
		Fan f2 = new Fan(Fan.MEDIUM, 5, "blue", false);
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		
	}

}
