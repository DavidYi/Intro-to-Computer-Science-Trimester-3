package org.bca.introcs.u3;

public class CompanyInvoiceItemList {
	CompanyInvoiceItem[] item = new CompanyInvoiceItem[2];
	int numItems = 0;
	
	public CompanyInvoiceItemList(){
		//Default constructor creates a new ItemList.
	}
	
	public void addItem(CompanyInvoiceItem i){
		//adds a new item to the end of the existing list.
		if (numItems >= item.length){
			CompanyInvoiceItem[] iNew = new CompanyInvoiceItem[item.length * 2];

			for (int j = 0; j < item.length; j++) {
				iNew[j] = item[j];
			}

			item = iNew;
		}
		
		item[numItems] = i;
		numItems++;
	}
	
	public int getTotalItems(){
		//Returns a count of the total numbers in the list
		return numItems;
		
	}
	
	public CompanyInvoiceItem getItem(int index){
		//returns a reference to an item at the specified index
		return item[index];
	}

}
