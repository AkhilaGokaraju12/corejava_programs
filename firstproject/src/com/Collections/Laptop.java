package com.Collections;

public class Laptop {
String brand;
String model;
double price;
@Override
public String toString() {
	return "Laptop [brand=" + brand + ", model=" + model + ", price=" + price + "]";
}
public Laptop(String brand, String model, double price) {
	super();
	this.brand = brand;
	this.model = model;
	this.price = price;
}
}
