package com.tutorials;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rand = (int) (Math.random() *(3-0) + 0);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter a number:");
		int userinput = scanner.nextInt();// int number from user
		
		
		
		
		
		boolean game = true;
		while(game) {
			if(userinput==rand) {
				// success
				System.out.println("You won! Please later.");
				
			}else {
				System.out.println("Your guess is incorrect, please enter a number again");
			//	System.out.println("UserInput: " +userinput )
				userinput = scanner.nextInt();
				
			}
		}

	}

}
