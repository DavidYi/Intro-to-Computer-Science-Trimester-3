package org.bca.introcs.u1;

import java.util.Scanner;

public class Lab1CompanyInvoiceReprise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What are the first items?");
		String item = input.nextLine();
		
		System.out.println("How much did the customer buy?");
		int purch = input.nextInt();
		
		System.out.println("How much is the price per item?");
		double cost = input.nextFloat();
		
		System.out.println("What are the second items?");
		input.nextLine();
		//is described
		String item2 = input.nextLine();
		
		System.out.println("How much did the customer buy?");
		int purch2 = input.nextInt();
		
		System.out.println("How much is the price per item?");
		double cost2 = input.nextFloat();
		
		double total = purch*cost;
		double total2 = purch2*cost2;
		double grand = total + total2;
		
		System.out.printf("%15s%10s%20s%15s\n", "Item Name", "Count", "Unit Cost", "Total");
		System.out.printf("%15s%10d%20.2f%15.2f\n", item, purch, cost, total);
		System.out.printf("%15s%10d%20.2f%15.2f\n", item2, purch2, cost2, total2);
		System.out.printf("%15s%10s%20s%15.2f\n", "Grand total", "", "", grand);
		
	}

}
