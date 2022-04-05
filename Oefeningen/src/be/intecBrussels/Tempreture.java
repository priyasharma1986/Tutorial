package be.intecBrussels;

import java.util.Arrays;

public class Tempreture {

	public static void main(String[] args) {
		
		

		int [] temperatures = {6, 3, 1, -1, -3, 0, -1};
		
	
		double total = 0;
		
		
		for(int i = 0; i < temperatures.length; i++) {
			total  += temperatures[i];
			
		}
		
		double average = total/temperatures.length;
		System.out.println("Average of temperatures: " + average);
		
		

		for(int i : temperatures) {
			if(i < 0) {
				System.out.println("Temperatue below 0 is: " + i);
				
			}
			
		}
	
	
		temperatures[6] = -2;
		System.out.println("Updated Temperatures: " + Arrays.toString(temperatures));
			
		
		
	}

}
