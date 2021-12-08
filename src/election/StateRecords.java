package election;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;


public class StateRecords extends Observable{
	
	private ArrayList <Observer> observers;
	private ArrayList <State> states;
	
	public StateRecords(ArrayList<State> states) {
		observers = new ArrayList<Observer>();
		this.states = states;
	}
	
	public void setVotes(ArrayList<State> states) {
		this.states = states;
		votesChanged();
	}
	
	public void votesChanged() {
		setChanged();
		notifyObservers(states);
		
	}

}
