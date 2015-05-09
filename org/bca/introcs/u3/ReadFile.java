package org.bca.introcs.u3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner input = new Scanner(new FileReader ("names.txt"));
		//Instead of using System.in, which is printing it in the console, we can print it in another file for every input
		
		while (input.hasNextLine()){
			//is true when there is another line
			String line = input.nextLine();
			
			String[] names = line.split("-");
			//splits the string into an array like in python
			for (int i = 0; i < names.length; i++){
				System.out.println(names[i]);
			}
			
			System.out.println("--------");
		}

	}

}
