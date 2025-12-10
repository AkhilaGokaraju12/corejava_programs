package com.oops;

public class Uber {
private String name;
private int rating;
private String vehicleName;
private int vehicleNumber;
public void setName(String name) {
	this.name=name;
}
public void setRating(int rating) {
	this.rating=rating;
	if(this.rating>=1 && this.rating<=5) {
		System.out.println(getRating());
	}
	else {
		System.out.println("no update");
	}
}
public void setVehicleName(String vehicleName) {
	this.vehicleName=vehicleName;
	
}
public void setVehicleNumber(int vehicleNumber) {
	this.vehicleNumber=vehicleNumber;
}
public String getName() {
	return name;
}
public int getRating() {
	return rating;
}
public String getVehicleName() {
	return vehicleName;
}
public int getVehicleNumber() {
	return vehicleNumber;
}

}
