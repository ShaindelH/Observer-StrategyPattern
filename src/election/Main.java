package election;

import java.util.ArrayList;
import java.util.Observer;

public class Main {

	public static void main(String[] args) {
		ArrayList<State> states = new ArrayList<State>();
		
		states.add(new State("New York", 29, 5000, 10000));
		states.add(new State("California", 55, 8000, 15000));
		states.add(new State("Alaska", 3, 1000, 400));
		states.add(new State("Florida", 29, 12000, 13000));
		states.add(new State("Colorado", 9, 9000, 5500));
		
		StateRecords votes2021 = new StateRecords(states);
		
		
		ObserverRep observerRep = new ObserverRep(states, votes2021);
		ObserverDem observerDem = new ObserverDem(states, votes2021);
		ObserverHonest observerHonest = new ObserverHonest(states, votes2021);
		ObserverRep2 observerRep2 = new ObserverRep2(states, votes2021);
		ObserverDem2 observerDem2 = new ObserverDem2(states, votes2021);
		
		states.get(0).setRepVotes(1000);
		states.get(0).setDemVotes(2000);
		states.get(1).setRepVotes(30000);
		states.get(1).setDemVotes(40);
		states.get(2).setRepVotes(6000);
		states.get(2).setDemVotes(55657);
		states.get(3).setRepVotes(79);
		states.get(3).setDemVotes(200);
		states.get(4).setRepVotes(11);
		states.get(4).setDemVotes(3098);
		
		votes2021.setVotes(states);			
	}

}
