package com.uy.TFT.models;

public class Summoner {
	// class properties
	private String id;
	
	private String accountId;
	
	private Integer profileIconId;
	
	private String puuid;

	private String name;

	private Integer summonerLevel;
	
	private Long revisionDate;
	
	// constructor
	public Summoner() {}

	// getters & setters
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Long getRevisionDate() {
		return revisionDate;
	}

	public void setRevisionDate(Long revisionDate) {
		this.revisionDate = revisionDate;
	}
}