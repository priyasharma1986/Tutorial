package com.tutorials;

import java.util.Scanner;

public class practice1 {
	
	
		  public static void main(String[] args) {
		    
		    Scanner kbd = new Scanner(System.in);
		    System.out.println("Enter any no between[1-7]: ");
		    
		    int no = kbd.nextInt();
		    
		    if( no == 1){
		      System.out.println("1 is Monday");
		      
		    }else if(no == 2){
		      System.out.println("2 is Tuesday");
		    
		      
		    }else if (no == 3){
		      System.out.println("3 is Wednesday");
		      
		    }else if (no == 4){
		      System.out.println("4 is Thursday");
		      
		    }else if (no == 5){
		      System.out.println("5 is Friday");
		      
		    }else if (no == 6){
		      System.out.println("6 is Saturday");
		      
		    }else if (no == 7){
		      System.out.println("7 is Sunday");
		      
		    }else {
		      System.out.println("invalid entry");
		      
		    }
		  
		    
		    

		 }
		}


