package org.bca.introcs.u4;

public class PersonTest {

	public static void main(String[] args) {
		Student s = new Student("Jeffery", "Beane", 2020);
		Teacher t = new Teacher("Graham", "Watkins", "Mathematics");
		t.setLastName("Wakins");
		
		System.out.println(s);
		System.out.println(s.getGreeting());
		
		System.out.println(t);
		System.out.println(t.getGreeting());
	}

}
