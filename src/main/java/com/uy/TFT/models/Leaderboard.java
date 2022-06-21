package com.uy.TFT.models;

public class Leaderboard {

 private ChallengerPlayer[] players;
 
 public Leaderboard(ChallengerPlayer[] myObjects) {
	 this.players = myObjects;
 }

public ChallengerPlayer[] getPlayers() {
	return players;
}

public void setPlayers(ChallengerPlayer[] players) {
	this.players = players;
}
 
}
