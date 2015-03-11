package org.bca.introcs.u1;

import java.util.Random;

public class Day5Switch {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int i = rand.nextInt(6);
		
		System.out.println("i = " + i);
		
		switch(i){
		//switch can only be used with primitives. It is like ==
		case 0:
			//when i = 0 do this
			System.out.println("Sunny!");
			break;
			//this tells it to skip the other cases and default
			
		case 1:
			//when i = 1 do this
			System.out.println("Rainy");
			break;
			
		case 2:
			//when i = 2 do this
			System.out.println("Partly Sunny");
			break;
			
		default:
			//this is like an else, while the cases are elif/if
			System.out.println("I don't know.");
		
		}

	}

}
