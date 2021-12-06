package election;

import java.util.ArrayList;
import java.util.Observable;

public class ObserverRep extends VoteReport {

	public ObserverRep(ArrayList<State> states, StateRecords observable) {
		super(new PopularRepublican(states), new ElectoralRepublican1(states), states, observable);
	}

}
