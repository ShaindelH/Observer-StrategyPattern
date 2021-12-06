package election;

import java.util.ArrayList;

public class ElectoralDemocrat1 implements IElectoral {
	
	private ArrayList<State> states = new ArrayList<State>();

	public ElectoralDemocrat1(ArrayList<State> states) {
		this.states = states;
	}
	
	//This is a democrat favoring strategy that assumes that the state with the most electoral votes will go to the democrat regardless of polling data
	@Override
	public String reportElectoral() {
		
		StringBuilder report = new StringBuilder();
		State maxElectors = states.get(0);
		int max = maxElectors.getElectoral();
		
		//get state with highest electors
		for (int i = 1; i < states.size(); i++) {
			if (max < states.get(i).getElectoral()) {
				maxElectors = states.get(i);
				max = maxElectors.getElectoral();
			}
		}
		
		//calculate the rep and dem electors
		int repElectors = 0;
		int demElectors = 0;
		for(int i=0; i<states.size(); i++) {
			if(states.get(i).getRepVotes() > states.get(i).getDemVotes()) {
				repElectors += states.get(i).getElectoral();
			}
			else {
				demElectors += states.get(i).getElectoral();
			}
		}
		
		//give dem the state with the highest electors
		if (maxElectors.getRepVotes() > maxElectors.getDemVotes()) {
			repElectors -= maxElectors.getElectoral();
			demElectors += maxElectors.getElectoral();
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
