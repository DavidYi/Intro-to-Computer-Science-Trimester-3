package org.bca.introcs.u3;

public class CompanyInvoiceItem {
	String name;
	int quantity;
	double unitPrice;
	
	public CompanyInvoiceItem(String name, int quantity, double unitPrice){
		//Constructs a new item with the given name, quantity, and unit price
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	public double getTotal(){
		//Returns the total cost of the item based upon the quantity and unit price
		return unitPrice * quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
