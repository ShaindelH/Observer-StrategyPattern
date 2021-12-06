package election;

import java.util.ArrayList;

public class ElectoralRepublican2 implements IElectoral {

	private ArrayList<State> states = new ArrayList<State>();

	public ElectoralRepublican2(ArrayList<State> states) {
		this.states = states;
	}

	@Override
	public String reportElectoral() {
		StringBuilder report = new StringBuilder();
		int tempDiff;
		State lowest = states.get(0);
		int difference = lowest.getDemVotes() - lowest.getRepVotes();
		//find which state the democrats have the smallest lead
		for (int i = 1; i < states.size(); i++) {
			tempDiff = states.get(i).getDemVotes() - states.get(i).getRepVotes();
			if (difference > tempDiff && tempDiff > 0) {
				lowest = states.get(i);
				difference = tempDiff;
			}
		}

		// calculate the rep and dem electors
		int repElectors = 0;
		int demElectors = 0;
		for (int i = 0; i < states.size(); i++) {
			if (states.get(i).getRepVotes() > states.get(i).getDemVotes()) {
				repElectors += states.get(i).getElectoral();
			} else {
				demElectors += states.get(i).getElectoral();
			}
		}

		demElectors -= lowest.getElectoral();
		
		//divide the electors
		int halfElectors = lowest.getElectoral() / 2;
		repElectors += halfElectors;
		demElectors += halfElectors;
		
		//if odd number of electors, give the extra to republican
		if (lowest.getElectoral() % 2 == 1) {
			repElectors += 1;
		}
		
		String winner;
		if(repElectors > demElectors) {
			winner = "REP";
		}
		else {
			winner = "DEM";
		}

		report.append("Electoral Vote: REP " + repElectors + " DEM " + demElectors);
		report.append("\nProjected Winner: " + winner);

		return report.toString();
	}

}
