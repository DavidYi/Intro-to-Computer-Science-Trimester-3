package org.bca.introcs.u3;

public class Club {
	public static final int MORNING = 0;
	public static final int AFTERNOON = 1;
	public static final String[] TYPE_STR = { "Morning", "Afternoon" };

	private String name, advisor;
	private ClubStudent[] students = new ClubStudent[2];
	private int type, numStudents = 0;

	public Club(String name, String advisor, int type) {
		this.name = name;
		this.advisor = advisor;
		this.type = type;
	}

	public void expandList() {
		ClubStudent[] pNew = new ClubStudent[students.length * 2];

		for (int i = 0; i < students.length; i++) {
			pNew[i] = students[i];
		}

		students = pNew;
	}

	public void addStudent(ClubStudent s) {
		if (numStudents >= students.length) {
			expandList();
		}
		students[numStudents] = s;
		numStudents++;
	}

	public void addStudent(String fName, String lName, String academy, int year) {
		ClubStudent s = new ClubStudent(fName, lName, academy, year);
		addStudent(s);
	}
	
	public boolean deleteStudent(String firstName, String lastName){
		int index = findStudent(firstName, lastName);
		if (index == -1 ){
			return false;
		}
		
		for (int i = index; i < numStudents - 1; i++){
			students[i] = students[i + 1];
		}
		numStudents--;
		
		return true;
		
		
	}
	
	public int findStudent(ClubStudent s){
		for (int i = 0; i < numStudents; i++){
			if (students[i].equals(s)){
				return i;
			}
		}
		return -1;
	}
	
	public int findStudent(String firstName, String lastName){
		ClubStudent s = new ClubStudent(firstName, lastName);
		
		return findStudent(s);
	}

	public String toString() {
		String s = name + " (" + advisor + ") " + TYPE_STR[type];
		for (int i = 0; i < numStudents; i++) {
			s += "\n\t" + students[i];
		}
		return s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getNumStudents() {
		return numStudents;
	}

}
