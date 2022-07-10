package com.uy.TFT.models;


import java.util.List;

public class Participant {
	private List <String> augments;
	private List <Trait> traits;
	private List <Unit> units;
	private Companion companion;
	private Integer gold_left;
	private Integer last_round;
	private Integer level;
	private Integer placement;
	private Integer players_eliminated;
	private String puuid;
	private Integer time_eliminated;
	private Integer total_damage_to_players;
	

	public Participant(){
		
	}


	public List<String> getAugments() {
		return augments;
	}


	public void setAugments(List<String> augment) {
		this.augments = augment;
	}


	public List<Trait> getTraits() {
		return traits;
	}


	public void setTraits(List<Trait> traits) {
		this.traits = traits;
	}


	public List<Unit> getUnits() {
		return units;
	}


	public void setUnits(List<Unit> units) {
		this.units = units;
	}


	public Companion getCompanion() {
		return companion;
	}


	public void setCompanion(Companion companion) {
		this.companion = companion;
	}


	public Integer getGold_left() {
		return gold_left;
	}


	public void setGold_left(Integer gold_left) {
		this.gold_left = gold_left;
	}


	public Integer getLast_round() {
		return last_round;
	}


	public void setLast_round(Integer last_round) {
		this.last_round = last_round;
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


	public Integer getPlayers_eliminated() {
		return players_eliminated;
	}


	public void setPlayers_eliminated(Integer players_eliminated) {
		this.players_eliminated = players_eliminated;
	}


	public String getPuuid() {
		return puuid;
	}


	public void setPuuid(String puuid) {
		this.puuid = puuid;
	}


	public Integer getTime_eliminated() {
		return time_eliminated;
	}


	public void setTime_eliminated(Integer time_eliminated) {
		this.time_eliminated = time_eliminated;
	}


	public Integer getTotal_damage_to_players() {
		return total_damage_to_players;
	}


	public void setTotal_damage_to_players(Integer total_damage_to_players) {
		this.total_damage_to_players = total_damage_to_players;
	}
	
	
}
