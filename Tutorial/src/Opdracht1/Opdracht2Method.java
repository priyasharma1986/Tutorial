package Opdracht1;

import java.util.Scanner;

public class Opdracht2Method {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the numbers ");
		
		
		int firstNumber = scanner.nextInt();
		System.out.println("First number is: " + firstNumber);
		
		
		int secondNumber = scanner.nextInt();
		System.out.println("Second number is: " + secondNumber);
		
		int thirdNumber = scanner.nextInt();
		System.out.println("Third number is: " + thirdNumber);
		
		int average = averageOfThreeNumbers( firstNumber,  secondNumber,  thirdNumber);
		System.out.println("Avarage of three numbers is: " + average);
		
		
	}
		
	public static int averageOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
			return ((firstNumber + secondNumber + thirdNumber)/3);
		}
		 
	

	
	

}
