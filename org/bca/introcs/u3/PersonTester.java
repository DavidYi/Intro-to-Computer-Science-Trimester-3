package org.bca.introcs.u3;

public class PersonTester {

	public static void main(String[] args) {
		Person a = new Person("Hurki", "Female");
		Person b = new Person("Emma", "Girl");
		
		a.talk();
		b.talk();
		
		for (int i = 0; i < 5; i++){
			a.celebrate_bday();
		}

	}

}
