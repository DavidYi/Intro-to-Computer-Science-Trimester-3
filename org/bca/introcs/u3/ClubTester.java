package org.bca.introcs.u3;

public class ClubTester {

	public static void main(String[] args) {
		Club c1 = new Club("HackBCA", "Mr. Respass", Club.AFTERNOON);
		Club c2 = new Club("Helping Nepal", "Mr. Respass", Club.MORNING);

		c1.addStudent("David", "Yi", "ATCS", 2018);
		c1.addStudent("Rhee", "Kenneth", "ATCS", 2016);
		c1.addStudent("Rikako", "Onuma", "ATCS", 2017);

		System.out.println(c1);
		
		ClubStudent s = new ClubStudent("Ohm", "Nabar");
		
		c1.deleteStudent("David", "Yi");
		
		System.out.println(c1);

	}

}
