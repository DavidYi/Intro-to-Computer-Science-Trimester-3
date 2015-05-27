package org.bca.introcs.u4;

public class Teacher extends Person {
	private String department;
	
	public Teacher(String firstName, String lastName, String department){
		super(firstName, lastName);
		this.department = department;
	}
	
	@Override
	public String toString(){
		return "Teacher: " + firstName + " " + lastName + " - " + department;
	}

	@Override
	public String getGreeting() {
		return "Hi, I'm teacher " + lastName;
	}
	
	

}
