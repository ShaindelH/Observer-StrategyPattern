package election;

import java.util.ArrayList;

public class ElectoralHonest implements IElectoral {

	private ArrayList<State> states = new ArrayList<State>();

	public ElectoralHonest(ArrayList<State> states) {
		this.states = states;
	}

	@Override
	public String reportElectoral() {
		StringBuilder report = new StringBuilder();

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
