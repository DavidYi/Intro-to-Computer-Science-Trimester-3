package org.bca.introcs.u1.ex;

public class Day7ForLoopPractice2 {

	public static void main(String[] args) {
		//Write a program that displays a two tables side by side (note that 1 mile is 1.609 km) Where miles increase 1 to 10 and you convert it
		//the other table you increase from 20 to 65 by 5 and covert it to miles
		
		int m, km;
		
		System.out.printf("%-20s%-15s\t|\t%-20s%-20s\n", "Miles", "Kilometers", "Kilometers", "Miles");
		
		for (m = 1; m<=10; m += 1){
			km = 20;
			
			System.out.printf("%-20d%-15.3f\t|\t%-20d%-20.3f\n", m, m * 1.609, km, km / 1.609);
			
			km += 5;
		}

	}

}
