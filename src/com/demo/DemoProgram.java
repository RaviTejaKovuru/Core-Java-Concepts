package com.demo;

import java.util.Scanner;

public class DemoProgram {
	
	public void methodone() {
		System.out.println("First Method");
		
	}
	public void methodtwo() {
		System.out.println("Second method");
		int	a;
		int b;
		
	}
	

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter employee Id");
		int EmpId = obj.nextInt();
		System.out.println("Employee Id is:" +EmpId);
		Scanner Obj = new Scanner(System.in); 
	    System.out.println("Enter Employee Name");
	    String EmpName = Obj.nextLine(); 
	    System.out.println("Employee Name is: " + EmpName);
	    System.out.println("Enter Employee Name");
	    String EmplName = Obj.next(); 
	    System.out.println("Employee Name is: " + EmplName);
		
		
		DemoProgram object = new DemoProgram();
		System.out.println("This is Demo program");
		object.methodone();
		object.methodtwo();
		
		byte b =10;
		System.out.println("byte vaue is " +b);
		boolean B =true;
		System.out.println(B);
		float f =123.456f;
		System.out.println(f);
		long l =123456789l;
		System.out.println(l);
		String s ="Hi, this is Teja";
		System.out.println(s);
		
		


		
		

	}

}
