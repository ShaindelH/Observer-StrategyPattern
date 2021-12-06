package election;

import java.util.ArrayList;

public class ObserverDem2 extends VoteReport{
	
	public ObserverDem2(ArrayList<State> states, StateRecords observable) {
		super(new PopularDemocrat(states), new ElectoralHonest(states), states, observable);
	}

}
