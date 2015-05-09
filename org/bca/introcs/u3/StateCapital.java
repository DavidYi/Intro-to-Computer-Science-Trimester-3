package org.bca.introcs.u3;

public class StateCapital {
	String state, capital;
	
	public StateCapital(String state, String capital){
		this.state = state;
		this.capital = capital;
	}
	
	public boolean equals(Object o){
		//Returns true if the states names match, otherwise false.
		StateCapital s = (StateCapital) o;
		if (this.state.equals(s.state)){
			return true;
		}
		return false;
	}
	
	public String getState(){
		//returns the name of the state
		return state;
	}
	
	public String getCapital(){
		//returns the name of the capital
		return capital;
	}

}
