package application;

import pojo.*;

public class FootballGame {

	public static void main(String[] args) {
		//--------Player Section--------		
		Player goalKeeper = new Player();
		Player striker1 = new Player("ABC",30);
		Player striker2 = new Player("XYZ",20);
		System.out.println("Striker1: Name-" + striker1.getName() +" Age-"+ striker1.getAge());
		System.out.println("Striker2: Name-" + striker2.getName() +" Age-"+ striker2.getAge());
		goalKeeper.setAge(50);
		goalKeeper.setName("OPQ");
		//System.out.println("-->" + goalKeeper.getAge());
		System.out.println("GoalKeeper: Name-" + goalKeeper.getName() +" Age-"+ goalKeeper.getAge());
		
		//--------Ball Section--------	
		Ball newBall = new Ball( "Grey", 10 , "Nike");
		System.out.println("Ball Details: Colour-" + newBall.getColour() +" Make-"+ newBall.getMake()+" Size-"+ newBall.getSize());
		
		//--------Stadium Section--------	
		Stadium Stadium1 = new Stadium();
		Stadium Stadium2 = new Stadium("FNB Stadium", "Johannesburg - South Africa", 94736);
		Stadium Stadium3 = new Stadium("Rose Bowl Stadium", "Pasadena, California - USA", 90888);
		Stadium1.setName("ANZ Stadium");
		Stadium1.setPlace("Sydney - Australia");
		Stadium1.setCapacity(84000);
		System.out.println("Stadium1: Name-" + Stadium1.getName() +" Place-"+ Stadium1.getPlace() +" Capacity-"+ Stadium1.getCapacity());
		System.out.println("Stadium2: Name-" + Stadium2.getName() +" Place-"+ Stadium2.getPlace() +" Capacity-"+ Stadium2.getCapacity());
		System.out.println("Stadium3: Name-" + Stadium3.getName() +" Place-"+ Stadium3.getPlace() +" Capacity-"+ Stadium3.getCapacity());
	
		//--------Team Section--------
		Team Team1 = new Team();
		Team Team2 = new Team("UVW", 15, 30, 20, 45);
		Team Team3 = new Team("PQR", 25, 40, 20, 65);
		Team1.setName("STU");
		Team1.setLosses(19);
		Team1.setWins(24);
		Team1.setStrength(20);
		Team1.setGamesPlayed(43);
		System.out.println("Team1: Name-" + Team1.getName() +" Wins-"+ Team1.getWins() +" Losses-"+ Team1.getLosses()+" Played-"+ Team1.getGamesPlayed()+" Strength-"+ Team1.getStrength());
		System.out.println("Team2: Name-" + Team2.getName() +" Wins-"+ Team2.getWins() +" Losses-"+ Team2.getLosses()+" Played-"+ Team2.getGamesPlayed()+" Strength-"+ Team2.getStrength());
		System.out.println("Team3: Name-" + Team3.getName() +" Wins-"+ Team3.getWins() +" Losses-"+ Team3.getLosses()+" Played-"+ Team3.getGamesPlayed()+" Strength-"+ Team3.getStrength());
	
	}
}
