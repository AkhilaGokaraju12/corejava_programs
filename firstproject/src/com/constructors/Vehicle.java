package com.constructors;

public class Vehicle {
String vehicletype;
String cartype;
Vehicle(){
	System.out.println("hjh");
}

Vehicle(String vehicletype){
	this.vehicletype=vehicletype;	
}
}
class Car extends Vehicle{
	
	
	Car(String cartype){
	
		this.cartype=cartype;
		
	}
	public static void main(String[] args) {
		Car c=new Car("vehicle");
		c.show();
	}
	void show() {
		System.out.println(vehicletype);
		System.out.println(cartype);
	}
}
