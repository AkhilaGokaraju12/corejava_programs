package com.interfaces;

public class Exec {

	public static void main(String[] args) {
Animal c=new Cat();
	Animal d=new Dog();
	System.out.println("*****cat*****");
	c.walk();
	c.run();
	c.eat();
	Animal.sleep();
	System.out.println("*****dog*****");
	d.run();
	d.walk();
	d.eat();
	Animal.sleep();

	}

}
