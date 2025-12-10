package com.constructors;

public class Fuel {
//	String VehicleNumber;
//	double petrolLiter;
//	double diselLiter;
//	double totalcost;
//	
//
//	public static void main(String[] args) {
//		Fuel f=new Fuel();
//		f.customer("KL01V1234",2,1);
//		f.customer("MH02VD2636",1,3);
//		f.customer("27 CD 10",1,3);
//		
//
//	}
//void customer(String VehicleNumber,double petrolLiter,double diselLiter) {
//	this.VehicleNumber=VehicleNumber;
//	this.petrolLiter=petrolLiter;
//	this.diselLiter=diselLiter;
//	this.totalcost=(petrolLiter*120)+(diselLiter*140);
//	System.out.println("Vehicle Number:"+this.VehicleNumber);
//	System.out.println("petrolLiter:"+this.petrolLiter);
//	System.out.println("disel Liter:"+this.diselLiter);
//	System.out.println("totalcost:"+this.totalcost);
//	System.out.println("*****************");
//}
//}
	String VehicleNumber;
    double petrolLiter;
	double diselLiter;
	double totalcost;
	Fuel(String VehicleNumber,double petrolLiter,double diselLiter){
		this.VehicleNumber=VehicleNumber;
		this.petrolLiter=petrolLiter;
		this.diselLiter=diselLiter;
		this.totalcost=(petrolLiter*120)+(diselLiter*140);
	}
public static void main(String[] args) {
	Fuel f=new Fuel("KL01V1234",2,1);
	f.show();
	Fuel f1=new Fuel("MH02VD2636",1,3);
	f1.show();
	Fuel f2=new Fuel("27 CD 10",1,3);
	f2.show();
	}
void show() {
	System.out.println("Vehicle Number:"+this.VehicleNumber);
	System.out.println("petrolLiter:"+this.petrolLiter);
	System.out.println("disel Liter:"+this.diselLiter);
	System.out.println("totalcost:"+this.totalcost);
	System.out.println("*****************");
}

}
