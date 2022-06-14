package com.uy.TFT.models;

import java.util.List;

public class Leaderboard {

 private List<ChallengerPlayer> players;
 
 public Leaderboard(List<ChallengerPlayer> players) {
	 this.players = players;
 }

public List<ChallengerPlayer> getPlayers() {
	return players;
}

public void setPlayers(List<ChallengerPlayer> players) {
	this.players = players;
}
 
}
