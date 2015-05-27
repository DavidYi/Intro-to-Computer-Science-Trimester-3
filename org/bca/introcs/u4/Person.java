package org.bca.introcs.u4;

abstract class Person {
	protected String firstName, lastName;

	protected Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	abstract public String getGreeting();

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

}
