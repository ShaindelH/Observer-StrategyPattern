package election;

import java.util.ArrayList;

public class ObserverRep2 extends VoteReport{
	
	public ObserverRep2(ArrayList<State> states, StateRecords observable) {
		super(new PopularDemocrat(states), new ElectoralRepublican1(states), states, observable);
	}
}
