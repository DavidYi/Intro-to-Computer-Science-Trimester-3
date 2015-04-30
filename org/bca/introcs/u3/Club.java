package org.bca.introcs.u3;

public class Club {
	public static final int MORNING = 0;
	public static final int AFTERNOON = 1;
	public static final String[] TYPE_STR = {"Morning", "Afternoon"};
	
	private String name, advisor;
	private ClubStudent[] students = new ClubStudent[2];
	private int type, numStudents = 0;
	
	public Club(String name, String advisor, int type) {
		this.name = name;
		this.advisor = advisor;
		this.type = type;
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
