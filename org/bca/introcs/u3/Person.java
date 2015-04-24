package org.bca.introcs.u3;

public class Person {
	int age;
	String name, gender;

	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
		this.age = 0;
	}

	public String toString() {
		return "Person: " + this.name + "; Gender: " + gender + "; Age: "
				+ this.age;

	}

	public void talk() {
		System.out.println("Hi, my name is " + name);

	}

	public void celebrate_bday() {
		this.age += 1;
		System.out.println("Happy Birthday! " + name + " is now "
				+ this.age);

	}
	
	

}
