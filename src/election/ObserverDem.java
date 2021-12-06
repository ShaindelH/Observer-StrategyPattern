package election;

import java.util.ArrayList;

public class ObserverDem extends VoteReport{
	
	public ObserverDem(ArrayList<State> states, StateRecords observable) {
		super(new PopularDemocrat(states), new ElectoralDemocrat2(states), states, observable);
	}
	
}
