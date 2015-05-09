package org.bca.introcs.u3;

import java.util.Scanner;

public class CompanyInvoice {
	
	public static CompanyInvoiceItemList readItems(){
		//This method reads a list of items to purchase from the user and returns the list as an ItemList
		Scanner input = new Scanner(System.in);
		CompanyInvoiceItemList itemList = new CompanyInvoiceItemList();
		
		System.out.println("Please enter the name of the first item purchased.");
		String name = input.nextLine();
		
		while(!name.equals("")){
			System.out.println("How many of these were purchased?");
			int quantity = input.nextInt();
			
			System.out.println("How much does each cost?");
			double unitCost = input.nextDouble();
			
			CompanyInvoiceItem i = new CompanyInvoiceItem(name, quantity, unitCost);
			
			itemList.addItem(i);
			
			System.out.println("Please enter the name of the next item or press enter to print invoice.");
			input.nextLine();
			name = input.nextLine();
		}
		return itemList;
		
	}
	
	public static void printInvoice(CompanyInvoiceItemList l){
		//This method prints an invoice for the items in ItemList		
		double total = 0;
		
		System.out.println("------------------------------------------------------------\nInvoice:");
		System.out.printf("%-25s%10s%12s%12s\n", "Item Name", "Quantity", "Unit Price", "Total");
		
		for (int i = 0; i < l.getTotalItems(); i++){
			CompanyInvoiceItem temp = l.item[i];
			System.out.printf("%-25s%10d%12.2f%12.2f\n", temp.name, temp.quantity, temp.unitPrice, temp.getTotal());
			total += temp.getTotal();
		}
		System.out.println("\n\tTotal Cost: " + total);
	}

	public static void main(String[] args) {
		CompanyInvoiceItemList list = readItems();
		printInvoice(list);

	}

}
