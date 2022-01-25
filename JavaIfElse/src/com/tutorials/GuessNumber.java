package com.tutorials;

import java.util.Scanner;



public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		
	 
		
		System.out.println( "guess the number between 1 to 5 : ");
		
		   int guessNumber = keyboard.nextInt(); 
		    
		    
			int getNumber = (int)(Math.random() * 5 +1);
	
		
	    
		if (guessNumber==getNumber) {
		
		   System.out.println("you guessed it right! + getNumber");
		   
	    }else   {
	    	
	    	System.out.println("you guessed it wrong! + getNumber");
		
		
		

	}
	}
}
	


