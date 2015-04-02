package org.bca.introcs.u2.ex;

import java.util.Scanner;

public class Day3HandShakes {

	public static void main(String[] args) {		
		String[] names = getNames();
		
		printHandshakes(names);

	}
	
	public static void printHandshakes (String[] a){
		for (int i = 0; i <  a.length; i++){
			
			for (int j = i + 1; j < a.length; j++){
				System.out.printf(a[i] + " ");
				System.out.println(a[j]);
				
			}
		}
		
	}
	
	public static String[] getNames(){
		Scanner input = new Scanner(System.in);
		System.out.println("How many people?");
		
		int ppl = input.nextInt();
		
		input.nextLine();
		
		String[] names = new String[ppl];
		
		System.out.println("Input the name:");
		for (int i = 0; i < ppl; i++){
			names[i] = input.nextLine();
		}
		
		return names;
		
	}

}
