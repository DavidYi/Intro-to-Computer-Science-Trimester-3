package org.bca.introcs.u3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class StateCapitalList {
	int numState = 0;
	StateCapital[] state = new StateCapital[2];

	public StateCapitalList(String fileName) throws FileNotFoundException {
		Scanner input = new Scanner(new FileReader(fileName));

		while (input.hasNextLine()) {
			String line = input.nextLine();

			String[] temp = line.split("\t");
			numState++;
			
			addCapital(temp);
		}
	}

	public StateCapital getRandomState(){
		//randomly returns a state from the list.
		Random rand = new Random();
		
		int index = rand.nextInt(numState);
		return state[index];
	}

	public int statesRemaining() {
		// returns the number of states remaining in the list. The quiz
		// continues until there are no states remaining in the list
		return numState;
	}

	public void remove(StateCapital sc) {
		// removes a given state from the list. This method is called when the
		// user correctly identifies the capital of the state
		int index = findState(sc);
		
		for (int i = index; i < numState - 1; i++){
			state[i] = state[i + 1];
		}
		numState--;
	}
	
	private int findState(StateCapital sc){
		for (int i = 0; i < numState; i++){
			if (state[i].equals(sc)){
				return i;
			}
		}
		return -1;
	}
	
	private void addCapital(String[] line) {
		// adds the capital
		if (numState >= state.length){
			expandList();
		}
		StateCapital temp = new StateCapital(line[0], line[1]);
		state[numState] = temp;
	}

	private void expandList() {
		StateCapital[] tempState = new StateCapital[state.length * 2];
		for (int j = 0; j < state.length; j++) {
			tempState[j] = state[j];
		}
		
		state = tempState;
	}

}
