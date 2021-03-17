package com.p.kart.controller;

import java.util.Scanner;

import com.p.kart.util.InputUtil;
public class MainController {

	public static void main(String[] args) {

		runApplication();//main page method

	}

	 static void runApplication() {

		Scanner scanner = InputUtil.getScanner();
		System.out.println("------WELCOME TO PKart-------");
		System.out.println("1. Customer \n 2.Admin \n   3.Exit");

		System.out.println("Enter your choice:");
		int choice = scanner.nextInt();

		switch (choice) {    //taking choices for main page

		case 1:
			CustomerController customerController = new CustomerController();
			customerController.operations();
			break;

		case 2:
			AdminController adminController = new AdminController();
			adminController.operations();
			break;
		case 3:
			System.out.println("logout..!");
			System.exit(1);
			
			

		}

	}
}
