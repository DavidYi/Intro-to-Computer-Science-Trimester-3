package org.bca.introcs.u2.ex;

public class Day13TextbookAssignmentCh5Exercise8 {

	public static void main(String[] args) {
		/* Write a class that contains the following two methods:
		 * public static double celsiusToFahrenheit (double celsius)
		 * public static double fahrenheitToCelsius(double fahrenheit)
		 * The formula for the conversion is:
		 * fahrenheit = (9.0 / 5) * celsius + 32
		 * Write a program that invokes these methods to display the tables for conversion of both side
		 * round to hundrenths if possible
		 */
		
		double cel = 40, far = 120, cel2, far2;
		
		System.out.printf("%-15s%-25s%-20s%-15s\n\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
		
		for (int i = 1; i <= 10; i++){
			far2 = celsiusToFahrenheit(cel);
			cel2 = fahrenheitToCelsius(far);
			
			System.out.printf("%-15.1f%-25.1f%-20.1f%-15.2f\n", cel, far2, far, cel2);
			
			cel--;
			far -= 10;
		
		}
	
	}
	
	public static double celsiusToFahrenheit (double celsius){
		double f = (9.0 / 5) * celsius + 32;
		return f;
	
	}
	
	public static double fahrenheitToCelsius(double fahrenheit){
		double c = (fahrenheit - 32) * (5.0 / 9); 
		return c;
	
	}

}
