package org.bca.introcs.u1.ex;

public class Ex4_17 {

	public static void main(String[] args) {
		/*Use nested loops that print patterns in four separate programs*/
		
		
		System.out.println("Pattern I");
		for (int i = 1; i <= 6; i++){
			for (int j = 1; j <= i; j++){
				System.out.printf("%-2d", j);
			}
			
			System.out.println();
		}
		
		
		System.out.println("\n\nPattern II");
		for (int i = 6; i >= 1; i--){
			for (int j = 1; j <= i; j++){
				System.out.printf("%-2d", j);
			}
			
			System.out.println();
		}
		
		
		System.out.println("\n\n Pattern III");
		for (int i = 1; i <= 6; i++){
			for (int x = 1; x <= 6 - i; x++){
				System.out.printf("  ");
			}
			
			for (int j = i; j >= 1; j--){
				System.out.printf("%2d", j);
			}
			
			System.out.println();
		}
		
		
		System.out.println("\n\n Pattern  IV");
		for (int i = 6; i >= 1; i--){
			for (int x = 1; x <= 6 - i; x++){
				System.out.printf("  ");
			}
			
			for (int j = 1; j <= i; j++){
				System.out.printf("%2d", j);
			}
			
			System.out.println();
		}
		
		
	}

}
