package com.uy.TFT.models;

import java.util.List;

public class Info {
	private Long game_datetime;
	private Double game_length;
	private String game_version;
	private List <Participant> participants;
	private Integer queue_id;
	private String tft_game_type;
	private String tft_set_core_name;
	private Integer tft_set_number;
	
	
	public Info() {}

	public Long getGame_datetime() {
		return game_datetime;
	}

	public void setGame_datetime(Long game_datetime) {
		this.game_datetime = game_datetime;
	}

	public Double getGame_length() {
		return game_length;
	}

	public void setGame_length(Double game_length) {
		this.game_length = game_length;
	}

	public String getGame_version() {
		return game_version;
	}

	public void setGame_version(String game_version) {
		this.game_version = game_version;
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	public Integer getQueue_id() {
		return queue_id;
	}

	public void setQueue_id(Integer queue_id) {
		this.queue_id = queue_id;
	}

	public String getTft_game_type() {
		return tft_game_type;
	}

	public void setTft_game_type(String tft_game_type) {
		this.tft_game_type = tft_game_type;
	}

	public String getTft_set_core_name() {
		return tft_set_core_name;
	}

	public void setTft_set_core_name(String tft_set_core_name) {
		this.tft_set_core_name = tft_set_core_name;
	}

	public Integer getTft_set_number() {
		return tft_set_number;
	}

	public void setTft_set_number(Integer tft_set_number) {
		this.tft_set_number = tft_set_number;
	}
	
	

} 
