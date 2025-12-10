package com.loopcondition;

import java.util.Scanner;

public class BatterySwitch {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	
System.out.println("1.battery Issues 2.Network isuuess 3.app crashes 4.Storage issues 5.Exit");
int a=s.nextInt();
switch(a) {
case 1->
	handleBatteryIssues();
case 2->
handleNetworkIssues();
case 3->
handleAppCrashIssues();
case 4->
handleStorageAppIssues();
case 5->
System.out.println("thank you for exist");
default->
System.out.println("invalid option");
}
}
static void handleBatteryIssues() {
System.out.println(" your battery is over heating yes or no");	
String s1=s.next();
if(s1.equals("yes")) {
	System.out.println("then you need to change battery");
}
else {
	System.out.println("there is no problem");
}
}
static void handleNetworkIssues() {
System.out.println("  your are facing network issuess yes or no ");	
String s1=s.next();
if(s1.equals("yes")) {
	System.out.println("on the flight mode");
}
else {
	System.out.println("there is no problem");
}
}
static void handleAppCrashIssues() {
System.out.println(" your are facing app crash issuess yes or no");	
String s1=s.next();
if(s1.equals("yes")) {
	System.out.println("then delete the app");
}
else {
	System.out.println("there is no problem");
}
}
static void handleStorageAppIssues() {
System.out.println(" your are facing Storage issuess yes or no");	
String s1=s.next();
if(s1.equals("yes")) {
	System.out.println("then delete the some apps and photos");
}
else {
	System.out.println("there is no problem");
}
}


}
