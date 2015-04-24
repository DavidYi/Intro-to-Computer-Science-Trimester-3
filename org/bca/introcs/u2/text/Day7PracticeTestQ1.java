package org.bca.introcs.u2.text;

public class Day7PracticeTestQ1 {

	public static double closestValueToMean (double[] list){
		double mean = 0, closest = 0;
		for (int i = 0; i < list.length; i++){
			mean += list[i];
		}
		mean /= list.length;
		
		for (int i = 0; i < list.length; i++){
			if (Math.abs(mean - closest) > Math.abs(mean - list[i])){
				closest = list[i];
			}
		}
		return closest;
		
	}
	
	public static void main(String[] args) {
		/*
		 * Write a method that will determine the mean of a list of numbers and
		 * then return the element of the list that is closest in distance to that
		 * mean. Note, you can use Math.abs to obtain the absolute value of a
		 * number. Test using these input to closestValuetoMean:
		 * new double[] {10.3, 20, 16.1, 2} --> returns 10.3
		 * new double[] {45.8, 18.91, 25.3, 38.2, 54} --> returns 38.2
		 */
		System.out.println(closestValueToMean (new double[] {10.3, 20, 16.1, 2}));
		System.out.println(closestValueToMean (new double[] {45.8, 18.91, 25.3, 38.2, 54}));
		
	}

}
