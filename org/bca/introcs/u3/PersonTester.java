package org.bca.introcs.u3;

public class PersonTester {

	public static void main(String[] args) {
		Person a = new Person("Yichen Hsieh", "Female");
		Person b = new Person("Emma", "Girl");
		
		System.out.println(a);
		System.out.println(b);
		
		a.talk();
		b.talk();
		
		for (int i = 0; i < 5; i++){
			a.celebrate_bday();
		}
		//a.age = 100;
		//System.out.println(a);
		//we made the variables private so you can't touch them anymore

	}

}
