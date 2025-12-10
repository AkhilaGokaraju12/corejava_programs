package com.constructors;

 public class Unary{
double res;
public Unary(){
	
}
	Unary(int employeeid,int pC,int ot,double bsalary){
		res=(pC>3 && ot >10)?(bsalary*0.10)+bsalary:
		(pC>3 || ot >10)?(bsalary*0.05)+bsalary:0;
	
		
	}
	public static void main(String[] args) {
//int employeeid=1;
//int pC=2;
//int ot=9;
//double bsalary=30000;
//double res=(pC>3 && ot >10)?(bsalary*0.10)+bsalary:
//	(pC>3 || ot >10)?(bsalary*0.05)+bsalary:0;
//
//System.out.println(pC+1);
//System.out.println(res);		
//	}
//}
   Unary u=new Unary(1,5,9,30000);
   u.show();
	}
	void show() {
		  
		 System.out.println(res);
	}
}
