package com.interfaces;

public  interface Animal {
public abstract void walk();
public abstract void run();
default void eat() {
	System.out.println("eating animal");
	play();
}
static void sleep() {
	System.out.println("all are sleep");
}
private void play() {
	System.out.println("play");
}
}
