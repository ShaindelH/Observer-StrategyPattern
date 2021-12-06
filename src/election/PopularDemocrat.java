package election;

import java.util.ArrayList;

public class PopularDemocrat implements IPopular{
	
	//This is a democrat favoring strategy
	//that ignores the state with the most republican votes
	
	private ArrayList<State> states = new ArrayList<State>();

	public PopularDemocrat(ArrayList<State> states) {
		this.states = states;
	}

	@Override
	public String reportPopular() {
		
		State maxRep = states.get(0);
		int repTotal = 0, demTotal = 0, i;
		
		//get state with highest rep votes
		for(i=1; i<states.size(); i++) {
			if(states.get(i).getRepVotes() > maxRep.getRepVotes()) {
				maxRep = states.get(i);
			}
		}
		
		//get totals
		for (i = 0; i < states.size(); i++) {
			demTotal += states.get(i).getDemVotes();
			repTotal += states.get(i).getRepVotes();
		}
		
		StringBuilder report = new StringBuilder();
		report.append("Popular Vote: REP " + (repTotal- maxRep.getRepVotes()) + " DEM " + (demTotal - maxRep.getDemVotes()));
		return report.toString();
			  
	}
	
}
