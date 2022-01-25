package com.tutorials;

import java.util.Scanner;

public class SwitchExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
		
		
		//global variables
		int budgetTotal = 0;
		int expenses = 0;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
			System.out.println("[1] + Add Income");
			System.out.println("[2] - Add Expense");
			System.out.println("[3] i Total Budget");
			System.out.println("[4] x Exit");
			int choice = keyboard.nextInt(); //user choice
			
			switch(choice) {
			case 1:
				boolean IncomeLogic = true;
				while(IncomeLogic) {
					System.out.println("Add new income");
					int income = keyboard.nextInt(); //2000
					budgetTotal += income; // budgettoal = 0 + 2000 = 2000
					IncomeLogic = false;
				}	

				
				break;
				
			case 2:
				boolean expensesLogic = true;
				while(expensesLogic) {
				    System.out.println("Add new Expense: ");
				    int expense = keyboard.nextInt();
				    budgetTotal -= expense; //budgetTotal = budgetTotal - expense
				   //2000 - 540 = budgetTotal
				    expenses += expenses;
			    	expensesLogic = false;
				
			    }
			
				break;
				
			case 3:
				
				System.out.println(budgetTotal);
				
				break;
				
			case 4:
				
				System.out.println("You are leaving...bye bye");
				System.out.println(0);
					
				break;
			
		    	
	     	}		
				
				
		    
			
			}
			
			
			
	
		}
		

	}


