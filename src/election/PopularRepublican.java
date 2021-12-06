package election;

import java.util.ArrayList;

public class PopularRepublican implements IPopular {
	
	private ArrayList<State> states = new ArrayList<State>();

	public PopularRepublican(ArrayList<State> states) {
		this.states = states;
	}
	
	@Override
	public String reportPopular(){
		StringBuilder report = new StringBuilder();
		
		int demTotal = 0;
		int repTotal = 0;
		
		//find the totals
		for(int i=0; i<states.size(); i++) {
			demTotal += states.get(i).getDemVotes();
			repTotal += states.get(i).getRepVotes();
		}
		
		
		report.append("Popular Vote: REP " + repTotal + " DEM " + (int)(.95 * demTotal));
		return report.toString();
		  
	}
	
	
	
}
