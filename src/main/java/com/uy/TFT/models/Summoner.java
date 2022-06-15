package com.uy.TFT.models;

public class Summoner {
	
	private Integer profileIconId;
	
	private String puuid;

	private String name;

	private Integer summonerLevel;
	

	public Summoner() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSummonerLevel() {
		return summonerLevel;
	}

	public void setSummonerLevel(Integer summonerLevel) {
		this.summonerLevel = summonerLevel;
	}

	public Integer getProfileIconId() {
		return profileIconId;
	}

	public void setProfileIconId(Integer profileIconId) {
		this.profileIconId = profileIconId;
	}

	public String getPuuid() {
		return puuid;
	}

	public void setPuuid(String puuid) {
		this.puuid = puuid;
	}
}