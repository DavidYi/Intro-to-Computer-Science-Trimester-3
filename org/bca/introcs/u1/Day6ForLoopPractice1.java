package org.bca.introcs.u1;

public class Day6ForLoopPractice1 {

	public static void main(String[] args) {
		//Write a program that displays a table of the conversion of kilograms to pounds, where the kilograms start at one and increase by 2 up to 199. 
		//The pound should be right aligned and kilogram should be left aligned (note that 1 kilogram is 2.2 pounds):
		
		System.out.printf("%-15s%10s\n", "Kilogram(s)", "Pound(s)");
		for (int kilo = 1; kilo < 200; kilo += 2){
			System.out.printf("%-15d%10.1f\n", kilo, kilo*2.2);
		}

	}

}
