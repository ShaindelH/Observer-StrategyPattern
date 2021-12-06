package election;

public class State {
	
	private String name;
	private int electoral;
	private int repVotes;
	private int demVotes;
	
	public State(String name, int electoral, int repVotes, int demVotes) {
		this.name = name;
		this.electoral = electoral;
		this.repVotes = repVotes;
		this.demVotes = demVotes;
	}

	public String getName() {
		return name;
	}

	public int getElectoral() {
		return electoral;
	}

	public int getRepVotes() {
		return repVotes;
	}

	public void setRepVotes(int repVotes) {
		this.repVotes = repVotes;
	}

	public int getDemVotes() {
		return demVotes;
	}

	public void setDemVotes(int demVotes) {
		this.demVotes = demVotes;
	}
	
	
}
