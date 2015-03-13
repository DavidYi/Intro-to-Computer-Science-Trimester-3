package org.bca.introcs.u1;

public class Day8MinMax {
	
	public static int max (int a, int b){
		if (a > b){
			return a;
		}
		else{
			return b;
		}
	}

	public static void main(String[] args) {
		//public is the visibility, which means that everyone can see it
		//void is the return type, which in this case there is none, which void means nothing to return
		//
		String str = "It is Friday!";
		
		System.out.println(str.charAt(3));
		//this gets the third character and prints it out
		
		System.out.println(str.indexOf('F'));
		//this finds the position in which F is found in the string and prints it

	}

}
