package com.multithreading;
class BookMySeats{
	int totalTickets=10;
 synchronized void bookSeats(int seats,String name) {
		if(seats<=totalTickets) {
			totalTickets=totalTickets-seats;
		 System.out.println(name+" : your tickets booked successfully : "+seats);
		 System.out.println(name+" : reamining available tickets : "+totalTickets);
		}else {
			System.err.println(name+" : tickets are sold out");
			System.err.println(name+" :  avaliable tickets are  : "+totalTickets);
		}
	}
}
public class BookMyShow extends Thread {
	static BookMySeats b;
	int seats;
	String name;
public void run() {
b.bookSeats(seats,name);
}
public static void main(String[] args) {
	b=new BookMySeats();
	BookMyShow Akhila=new BookMyShow();
	Akhila.seats=6;
	Akhila.name="Akhila";
	Akhila.start();
	
	BookMyShow phani=new BookMyShow();
	phani.seats=6;
	phani.name="phani";
	phani.start();
	BookMyShow chaitu=new BookMyShow();
	chaitu.seats=5;
	chaitu.name="chaitu";
	chaitu.start();
	

	}

}
