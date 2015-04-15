package org.bca.introcs.u2.ex;

public class Day5TextbookAssignmentCh6Exercise23 {

	public static void main(String[] args) {
		/*
		 * A school has 100 lockers and 100 students. All lockers are closed on
		 * the first day of school. As the students enter, the first student,
		 * denoted S1, opens every locker. Then the second student, S2, begins
		 * with the second locker, denoted L2, and closes every other locker.
		 * Student S3 begins with the third locker and changes every third
		 * locker (closes it if it was open, and opens it if it was closed).
		 * Student S4 beings with Locker L4 and changes every fourth locker.
		 * Student S5 starts with L5 and changes every fifth locker, and so on,
		 * until student S100 changes L100. After all the students have passed
		 * through the building and changed the lockers, which lockers are open?
		 * Write a program to find your answer. (Hint: use an array of 100
		 * Boolean elements, each of which indicates whether a locker is open
		 * (true) or closed (false). Initially all lockers are closed.)
		 */

		boolean[] locker = new boolean[100];

		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j * i <= 100; j++) {
				boolean open = locker[(j * i) - 1];
				if (open) {
					open = false;
				} else {
					open = true;
				}
				locker[(j * i) - 1] = open;
			}
		}

		for (int i = 0; i < 100; i++) {
			if (locker[i]) {
				System.out.println("L" + (i + 1) + " is open");
			}
		}

	}

}
