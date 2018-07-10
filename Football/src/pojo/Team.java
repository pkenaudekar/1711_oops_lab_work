package pojo;

public class Team {
	private char name;
	public char getName() {
		return name;
	}
	public void setName(char name) {
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
	private int strength;
	private int wins;
	private int losses;
	private int gamesPlayed;
	
	public void playmatch()
	{
		System.out.println("Match played");
	}
}
