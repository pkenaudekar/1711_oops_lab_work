package pojo;

public class Team {
	private String name;
	private int strength;
	private int wins;
	private int losses;
	private int gamesPlayed;
	
	public Team() {
		name="";
		strength=0;
		wins=0;
		losses=0;
		gamesPlayed=0;
		System.out.println("Team(s) created");
	}
	
	public Team(String name, Integer losses, Integer wins, Integer strength, Integer gamesPlayed) {
		this.name=name;
		this.strength=strength;
		this.wins=wins;
		this.losses=losses;
		this.gamesPlayed=gamesPlayed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	
	
	public void playmatch()
	{
		System.out.println("Match played");
	}
}
