package election;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class VoteReport implements Observer  {

	private IPopular iPopular;
	private IElectoral iElectoral;
	private String electoralReport;
	private String popularReport;
	private ArrayList<State> states;

	public VoteReport(IPopular iPopular, IElectoral iElectoral, ArrayList<State> states, StateRecords observable) {
		this.iPopular = iPopular;
		this.iElectoral = iElectoral;

		this.states = new ArrayList<State>();
		this.states = states;
		observable.addObserver(this);
	}

	public void setElectoralReport() {
		this.electoralReport = iElectoral.reportElectoral();
	}

	public void setPopularReport() {
		this.popularReport = iPopular.reportPopular();
	}

	public void display() {
			System.out.println(popularReport + "\n" + electoralReport);
			System.out.println("\nWe are not legally held accountable for inaccurate data\n");
	}
	
	@Override
	public void update(Observable stateRecords, Object states) {
		if(states instanceof ArrayList) {
			ArrayList<State> newStates = (ArrayList<State>)states;
			this.states = newStates;
		}
		setElectoralReport();
		setPopularReport();
		display();

	}
}