package com.intec;

import java.lang.reflect.Array;

public class ForloopExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] game = {11,33,33,65,88,66,44,99,11};
		
		
		for (int i =0; i< game.length;i++){
			for(int j = i+1; j<game.length; j++) {
				if (game[i] == game[j])
					System.out.println(game[j]);
					
			}
		}
		
		

	}

}
