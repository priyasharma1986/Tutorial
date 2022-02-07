package Opdracht1;

import java.util.Scanner;

public class Opdracht1Method {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers:");
      
		
		
		int firstNumber = scanner.nextInt();
		System.out.println("First number is: "+ firstNumber);
		
		
		int secondNumber = scanner.nextInt();
		System.out.println("Second number is: " + secondNumber);
		
		

		int thirdNumber = scanner.nextInt();
		System.out.println("Third number is: " + thirdNumber);
		
		
		
		int lowestValue = findLowestValue(firstNumber, secondNumber, thirdNumber);
		System.out.println("The lowest value is: " + lowestValue);
		
		

	}

	
	
	public static int findLowestValue(int firstNumber, int secondNumber, int thirdNumber) {
		
		//return (firstNumber > secondNumber) ? secondNumber : firstNumber;
	    return Math.min(Math.min(firstNumber,  secondNumber), thirdNumber);
	
		
	}

}
