package com.intec;

public class ForloopExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] fizzgame = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for(int x: fizzgame) {
			System.out.println(x);
			if (x%2 == 0) {
				System.out.println( "fizz");
			}else {
				System.out.println("buzz");
			}
		}
		

	}

}
