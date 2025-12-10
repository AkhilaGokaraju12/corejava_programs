package com.oops;

public class Driver {
public static void main(String[] args) {
	Uber u=new Uber();
	u.setName("Akhila");
	u.setRating(3);
	u.setVehicleName("Auto");
	u.setVehicleNumber(89);
	System.out.println(u.getName());
	System.out.println(u.getVehicleNumber());
	System.out.println(u.getVehicleName());
}
}

