package election;

import java.util.ArrayList;

public class ElectoralDemocrat2 implements IElectoral{
	
	private ArrayList<State> states = new ArrayList<State>();

	public ElectoralDemocrat2(ArrayList<State> states) {
		this.states = states;
	}

	@Override
	public String reportElectoral() {
		
		StringBuilder report = new StringBuilder();
		
		int demTotal = 0;
		int repTotal = 0;
		
		for (int i = 0; i < states.size(); i++) {
			if (states.get(i).getDemVotes() > states.get(i).getRepVotes() * .98) {
				demTotal += states.get(i).getElectoral();
			}
			else {
				repTotal += states.get(i).getElectoral();
			}	
		}
		
		String winner;
		if(repTotal > demTotal) {
			winner = "REP";
		}
		else {
			winner = "DEM";
		}
		
		report.append("Electoral Vote: REP " + repTotal + " DEM " + demTotal);
		report.append("\nProjected Winner: " + winner);
		return report.toString();
	}
	

}
