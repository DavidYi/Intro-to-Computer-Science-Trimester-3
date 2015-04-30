package org.bca.introcs.u3;

public class ClubStudent {
	private String firstName, lastName, academy;
	private int year;
	
	public ClubStudent(String firstName, String lastName, String academy,
			int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.academy = academy;
		this.year = year;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

}
