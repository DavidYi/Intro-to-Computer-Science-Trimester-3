package org.bca.introcs.u4;

public class Student extends Person {
	int yearOfGraduation;

	public Student(String firstName, String lastName, int yearOfGraduation) {
		super(firstName, lastName);
		this.yearOfGraduation = yearOfGraduation;
	}

	@Override
	public String toString(){
		return "Student: " + firstName + " " + lastName + " - " + yearOfGraduation;
	}
	
	@Override
	public String getGreeting() {
		return "Hi, I'm " + firstName;
	}

	public int getYearOfGraduation() {
		return yearOfGraduation;
	}

	public void setYearOfGraduation(int yearOfGraduation) {
		this.yearOfGraduation = yearOfGraduation;
	}

}
