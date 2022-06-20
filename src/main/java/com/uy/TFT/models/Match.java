package com.uy.TFT.models;

import java.util.List;

public class Match {
	private List<Participant> participants;
	private String matchId;
	
	private Integer gameDatetime;
	
	private Double gameLength;
	
	private String gameVersion;
	
	private List<String> augment;
	
	private Integer goldLeft;
	
	private Integer lastRound;
	
	private Integer level;
	
	private Integer placement;
	
	private String puuid;
	
	private Double timeEliminated;
	
	public Match() {}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	public Integer getGameDatetime() {
		return gameDatetime;
	}

	public void setGameDatetime(Integer gameDatetime) {
		this.gameDatetime = gameDatetime;
	}

	public Double getGameLength() {
		return gameLength;
	}

	public void setGameLength(Double gameLength) {
		this.gameLength = gameLength;
	}

	public String getGameVersion() {
		return gameVersion;
	}

	public void setGameVersion(String gameVersion) {
		this.gameVersion = gameVersion;
	}

	public List<String> getAugment() {
		return augment;
	}

	public void setAugment(List<String> augment) {
		this.augment = augment;
	}

	public Integer getGoldLeft() {
		return goldLeft;
	}

	public void setGoldLeft(Integer goldLeft) {
		this.goldLeft = goldLeft;
	}

	public Integer getLastRound() {
		return lastRound;
	}

	public void setLastRound(Integer lastRound) {
		this.lastRound = lastRound;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getPlacement() {
		return placement;
	}

	public void setPlacement(Integer placement) {
		this.placement = placement;
	}

	public String getPuuid() {
		return puuid;
	}

	public void setPuuid(String puuid) {
		this.puuid = puuid;
	}

	public Double getTimeEliminated() {
		return timeEliminated;
	}

	public void setTimeEliminated(Double timeEliminated) {
		this.timeEliminated = timeEliminated;
	}
	
}
