package election;

import java.util.ArrayList;

public class ElectoralRepublican1 implements IElectoral {
	
	private ArrayList<State> states = new ArrayList<State>();

	public ElectoralRepublican1(ArrayList<State> states) {
		this.states = states;
	}

	@Override
	public String reportElectoral() {
		StringBuilder report = new StringBuilder();
		int repElectoral = 0;
		int demElectoral = 0;
		
		for(int i=0; i<states.size(); i++) {
			//checks if state is NY and adds it to republican electorals regardless of popular vote
			if(states.get(i).getName() == "New York") {
				repElectoral += states.get(i).getElectoral();
			}
			//if not NY...
			else{
				//if rep popular votes are less than dem popular votes add that states electoral votes to demElectoral
				if(states.get(i).getRepVotes() < states.get(i).getDemVotes()) {
					demElectoral += states.get(i).getElectoral();
				}
				//if dem votes are less, add that states electoral votes to repElectoral
				else {
					repElectoral += states.get(i).getElectoral();
				}
			} 
		}
		
		//determine projected winner
		String winner;
		if(repElectoral > demElectoral) {
			winner = "REP";
		}
		else {
			winner = "DEM";
		}
		
		report.append("Electoral Vote: REP " + repElectoral + " DEM " + demElectoral);
		report.append("\nProjected Winner: " + winner);
		return report.toString();
	}
	

}
