package com.kh.example.practice3.model;

import java.util.Arrays;

public class Lotto {

	public int[] lotto = new int[6];

	public String information() {

		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random()*45)+1;

			for(int j=0; j<i; j++)
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				} 
			
			// i=0, j=0
			// i=1, j=0
				// lotto[1] lotto[0] 같으면 i-- => i=1
			
			// i=2, j=0, j=1
				// lotto[2] lotto[0] 같으면 i-- => i=2
				// lotto[2] lotto[1] 같으면 i-- => i=2
			
			// i=3, j=0, j=1, j=2
			// i=4, j=0, j=1, j=2, j=3
			// i=5, j=0, j=1, j=2, j=3, j=4
		
			

			
			
		}

		return Arrays.toString(lotto);

	}


}
