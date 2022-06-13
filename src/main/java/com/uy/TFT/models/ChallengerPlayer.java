package com.uy.TFT.models;

public class ChallengerPlayer {
	
	private String summonerId;
	
	private String summonerName;
	
	private String ratedTier;
	
	private Integer ratedRating;
	
	private Integer wins;
	
	private Integer previousUpdateLadderPosition;
	
	public ChallengerPlayer() {}

	public String getSummonerId() {
		return summonerId;
	}

	public void setSummonerId(String summonerId) {
		this.summonerId = summonerId;
	}

	public String getSummonerName() {
		return summonerName;
	}

	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}

	public String getRatedTier() {
		return ratedTier;
	}

	public void setRatedTier(String ratedTier) {
		this.ratedTier = ratedTier;
	}

	public Integer getRatedRating() {
		return ratedRating;
	}

	public void setRatedRating(Integer ratedRating) {
		this.ratedRating = ratedRating;
	}

	public Integer getWins() {
		return wins;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}

	public Integer getPreviousUpdateLadderPosition() {
		return previousUpdateLadderPosition;
	}

	public void setPreviousUpdateLadderPosition(Integer previousUpdateLadderPosition) {
		this.previousUpdateLadderPosition = previousUpdateLadderPosition;
	}

}
