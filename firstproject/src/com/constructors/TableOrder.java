package com.constructors;

public class TableOrder {
	int tablenumber;
	int itemsorder;
	int itemsorder1;
	double billamount;
	double finalbill;

	TableOrder(int tablenumber) {
		this.tablenumber =tablenumber ;

	}

	public static void main(String[] args) {
		
		TableOrder t = new TableOrder(5);
	
        t.addAnOrder(3,2);
        t.serviceCharge(0.05f);
		t.bill();
	}
	void addAnOrder(int itemsorder,int itemsorder1) {
		this.itemsorder = itemsorder*150;	
		this.itemsorder1 = itemsorder1*200;
		this.billamount=this.itemsorder+this.itemsorder1;	
	}

	void serviceCharge(float f) {
	  this.finalbill=billamount*f+billamount;
	 
	} 

	void bill() {
		System.out.println(tablenumber);
		System.out.println(finalbill);
	}
}
