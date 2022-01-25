package com.tutorials;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		
		int myValue= 5;
		
		switch(myValue) {
		case 0:
			System.out.println("the number is 0");
		case 1:
			
			System.out.println("the number is 1");
		case 2:
			System.out.println("the number is 2");
		case 3:
			System.out.println("the number is 3");
			break;
		default:
			System.out.println("None of them is correct");
			

	}
*/
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("[1] Students");
			System.out.println("[2] Teachers");
			int choice = scanner.nextInt();
			
			
			switch(choice) {
			case 1:
				boolean studentBol = true;
				while(studentBol) {
					System.out.println("Enter student name:");
					String name = scanner.next();
					System.out.println("You have entered" + name);
					studentBol = false;
							
							
				}
			}
			
			
			
			
			
			
			
			
		}
}
}