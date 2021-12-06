package election;

import java.util.ArrayList;

public class PopularHonest implements IPopular{
	//This is a completely honest strategy that reports the exact results
	
	private ArrayList<State> states = new ArrayList<State>();

	public PopularHonest(ArrayList<State> states) {
		this.states = states;
	}
	
	@Override
	public String reportPopular() {
		
		StringBuilder report = new StringBuilder();
		
		int repTotal = 0, demTotal = 0;
		for (int i = 0; i < states.size(); i++) {
			demTotal += states.get(i).getDemVotes();
			repTotal += states.get(i).getRepVotes();
		}
		report.append("Popular Vote: REP " + repTotal+ " DEM " + demTotal);
		
		return report.toString();	
	}	
}
