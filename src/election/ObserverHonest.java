package election;

import java.util.ArrayList;

public class ObserverHonest extends VoteReport{
	
	public ObserverHonest(ArrayList<State> states, StateRecords observable) {
		super(new PopularHonest(states), new ElectoralHonest(states), states, observable);
	}
	
}
